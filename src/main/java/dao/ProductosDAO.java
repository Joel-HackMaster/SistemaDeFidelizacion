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
        String sql = "SELECT id, modelo,descripcion, precio FROM tt_producto ORDER BY id";  
        ps = connection.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            int id = rs.getInt("id");
            String modelo = rs.getString("modelo");
            String descripcion = rs.getString("descripcion");
            float precio = rs.getFloat("precio");
            ProductoEntity producto = new ProductoEntity(id, descripcion, precio, modelo);
            
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
        System.out.println("Prueba para git");
    }
    return productos;
}  
    
    public ProductoEntity obtenerProductosxModelo(String modelo) {
        ProductoEntity producto = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
    
        try {
            String sql = "SELECT stock, precio, descripcion, detalle, puntosxconv FROM tt_producto WHERE modelo = ?";  
            ps = connection.prepareStatement(sql);
            ps.setString(1, modelo);
            rs = ps.executeQuery();
        
            String descrip = rs.getString("descripcion");
            String detalle = rs.getString("detalle");
            int stock = rs.getInt("Stock");
            int puntos = rs.getInt("puntos");
            float precio = rs.getInt("precio");
        
            producto = new ProductoEntity(descrip, detalle, precio, stock, puntos);
        
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
        return producto;
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
   
   
   public ProductoEntity obtenerProductoPorModelo(String modelo) {
    ProductoEntity producto = null;
    Connection con = conexionController.conectar();
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        String sql = "SELECT descripcion, detalle, precio, puntosxconv, stock FROM tt_producto WHERE modelo = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, modelo);
        rs = ps.executeQuery();

        if (rs.next()) {
            String descripcion = rs.getString("descripcion");
            String detalle = rs.getString("detalle");
            float precio = rs.getFloat("precio");
            int stock = rs.getInt("stock");
            int puntos = rs.getInt("puntosxconv");
            producto = new ProductoEntity(descripcion, detalle, precio, stock, puntos);
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
   
   public int obtenerID(String modelo){
        PreparedStatement ps = null;
        ResultSet rs = null;
        int id = 0;
        
        try{
          String sql = "SELECT id FROM tt_producto WHERE modelo = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, modelo);
            rs = ps.executeQuery();
            id = rs.getInt("id");
            System.out.println("ID producto: "+id);
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
        return id;
    }
}
