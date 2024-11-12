/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.conexionController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.ProductoEntity;

/**
 *
 * @author jwsb1
 */
public class ProductosDAO {
    private Connection connection;

    public ProductosDAO(Connection connection) {
        this.connection = connection;
    }
    
    public int obtenerTotal() {
        int cantidad = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
          String sql = "SELECT COUNT(*) FROM tt_producto";
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
    
    public List<ProductoEntity> obtenerProductos() {
        
        List<ProductoEntity> productos = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
    
    try {
        String sql = "SELECT id, precio FROM tt_producto";  
        ps = connection.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            int id = rs.getInt("id");
            float precio = rs.getFloat("precio");        
            ProductoEntity producto = new ProductoEntity(id, precio);
            
            productos.add(producto);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return productos;
}  
    
   public float obtenerPrecioPorId(int id) {
    float precio = 0;
    Connection con = conexionController.conectar();
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        String sql = "SELECT precio FROM tt_producto WHERE id = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery();

        if (rs.next()) {
            precio = rs.getFloat("precio");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return precio;
    }
   
   public ProductoEntity obtenerProductoPorId(int id) {
    ProductoEntity producto = null;
    Connection con = conexionController.conectar();
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        String sql = "SELECT descripcion, detalle, precio, stock FROM tt_producto WHERE id = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery();

        if (rs.next()) {
            String descripcion = rs.getString("descripcion");
            String detalle = rs.getString("detalle");
            float precio = rs.getFloat("precio");
            int stock = rs.getInt("stock");
           

            producto = new ProductoEntity(descripcion, detalle, precio, stock);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return producto;
    }
}
