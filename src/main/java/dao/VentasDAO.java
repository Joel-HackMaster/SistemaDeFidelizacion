/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.VentaEntity;

/**
 *
 * @author jwsb1
 */
public class VentasDAO {
    private Connection connection;

    public VentasDAO(Connection connection) {
        this.connection = connection;
    }
    
    public int obtenerTotal() {
        int cantidad = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
          String sql = "SELECT COUNT(*) FROM tt_ventas";
            ps = connection.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                cantidad = rs.getInt("count");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cantidad;
    }
    
    public boolean registrarVenta(int idVendedor, int idProducto, String nombreCliente, float monto, String detalle) {
        PreparedStatement ps = null;
        try {
            // Llama al procedimiento almacenado
            String sql = "SELECT registrar_venta(?, ?, ?, ?, ?)";
            ps = connection.prepareCall(sql);

            // Establece los parámetros de entrada
            ps.setInt(1, idVendedor);
            ps.setInt(2, idProducto);
            ps.setString(3, nombreCliente);
            ps.setFloat(4, monto);
            ps.setString(5, detalle);

            // Ejecuta el procedimiento almacenado
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public List<VentaEntity> obtenerVentas() {
        List<VentaEntity> ventas = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
          String sql = "SELECT * FROM tt_ventas";
            ps = connection.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                int idVendedor = rs.getInt("idvendedor");
                int idProducto = rs.getInt("idproducto");
                String nombreCliente = rs.getString("nombrecliente");
                float montoVenta = rs.getFloat("montoventa");
                String fechaVenta = rs.getString("fechaventa");
                String detalle = rs.getString("detalleventa");
                
                VentaEntity venta = new VentaEntity(idVendedor, idProducto, nombreCliente, montoVenta, fechaVenta, detalle);
                ventas.add(venta);   
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ventas;
    }
}
