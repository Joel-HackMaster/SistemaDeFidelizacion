/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.VendedorEntity;

/**
 *
 * @author jwsb1
 */
public class VendedorDAO {
    private Connection connection;

    public VendedorDAO(Connection connection) {
        this.connection = connection;
    }
    
    public int obtenerTotal() {
        int cantidad = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
          String sql = "SELECT COUNT(*) FROM tt_vendedor";
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
    
    public List<VendedorEntity> obtenerVendedores() {
        List<VendedorEntity> vendedores = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
          String sql = "SELECT * FROM tt_vendedor";
            ps = connection.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String correo = rs.getString("correo");
                String dni = rs.getString("dni");
                int puntosxacum = rs.getInt("puntosxacum");
                int puntosxconv = rs.getInt("puntosxbon");
                
                VendedorEntity vendedor = new VendedorEntity(nombres, apellidos, correo, dni, puntosxacum, puntosxconv);
                vendedores.add(vendedor);   
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
        return vendedores;
    }
    
    public boolean insertarVendedor(String nombres, String apellidos, String dni, String correo) {
        PreparedStatement ps = null;
        boolean insertado = false;

        try {
            String sql = "INSERT INTO tt_vendedor (nombres, apellidos, dni, correo, password, puntosxacum, puntosxbon) VALUES (?, ?, ?, ? , ?, ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, dni);
            ps.setString(4, correo);
            ps.setString(5, dni);
            ps.setInt(6, 0);
            ps.setInt(7, 0);

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                insertado = true;  // Indica que la inserción fue exitosa
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return insertado;
    }
    
    public List<VendedorEntity> obtenerIDVendedor(){
      List<VendedorEntity>  vendedores = new ArrayList<>();
      
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
          String sql = "SELECT id, nombres, apellidos FROM tt_vendedor";
            ps = connection.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                
                VendedorEntity vendedor = new VendedorEntity(id, nombres, apellidos);
                
                System.out.println(vendedor);
                vendedores.add(vendedor);
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
        return vendedores;
    }
}
