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
import java.sql.Date;
import modelos.DetalleAcumulacionEntity;
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
    
    public boolean insertarVendedor(String nombres, String apellidos, String dni, String correo, Date fechaNac) {
        PreparedStatement ps = null;
        boolean insertado = false;

        try {
            String sql = "INSERT INTO tt_vendedor (nombres, apellidos, dni, correo, password, puntosxacum, puntosxbon, fecha_nac) VALUES (?, ?, ?, ? , ?, ?, ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, dni);
            ps.setString(4, correo);
            ps.setString(5, dni);
            ps.setInt(6, 0);
            ps.setInt(7, 0);
            ps.setDate(8, fechaNac);

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
    
    public int ValidarBonoCumple(int idVendedor) {
        PreparedStatement ps = null;
        int validado=0;
        ResultSet rs = null;

        try {
            String sql = "SELECT verificar_bono_cumpleanios(?) as Resultado";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idVendedor);
            rs = ps.executeQuery();
            if(rs.next()){
                validado = rs.getInt("Resultado");
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
        return validado;
    }
    
    public int AgregarBonoCumple(int idVendedor) {
        PreparedStatement ps = null;
        int validado=0;
        ResultSet rs = null;

        try {
            String sql = "select registrar_bono_cumpleanos(?) as Resultado";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idVendedor);
            rs = ps.executeQuery();
            if(rs.next()){
                validado = rs.getInt("Resultado");
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
        return validado;
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
    
    public int obtenerID(String nombreCompleto){
        PreparedStatement ps = null;
        ResultSet rs = null;
        int id = 0;
        
        try{
          String sql = "SELECT id FROM tt_vendedor WHERE CONCAT(nombres, ' ', apellidos) = ?;";
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            rs = ps.executeQuery();
            id = rs.getInt("id");
            System.out.println("ID Vendedor: "+id);
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
    
    public VendedorEntity obtenerPuntosPorNombre(String nombreCompleto){
        PreparedStatement ps = null;
        ResultSet rs = null;
        VendedorEntity vendedor = new VendedorEntity();
        
        
        try{
          String sql = "SELECT id,puntosxacum,puntosxbon,puntosxcons FROM tt_vendedor WHERE CONCAT(nombres, ' ', apellidos) = ?;";
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            rs = ps.executeQuery();
            
            if(rs.next()){
                System.out.println("Puntos acumulados: "+ rs.getInt("puntosxacum"));
                System.out.println("Puntos bon: "+ rs.getInt("puntosxbon"));
                System.out.println("Puntos cons: "+ rs.getInt("puntosxcons"));
                System.out.println("Puntos id: "+ rs.getInt("id"));
                vendedor = new VendedorEntity(rs.getInt("puntosxacum"), rs.getInt("puntosxbon"), rs.getInt("puntosxcons"), rs.getInt("id"));
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
        return vendedor;
    }
    
    public List<DetalleAcumulacionEntity> obtenerPuntosVendedores(int idVendedor) {
        List<DetalleAcumulacionEntity> detalles = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
          String sql = "SELECT id , idtipoacum, puntos, fecha_acum, bono_cum from tt_detalleAcumulacion as td where td.idvendedor = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idVendedor);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                int tipo = rs.getInt("idtipoacum");
                int puntos = rs.getInt("puntos");
                Date fecha = rs.getDate("fecha_acum");
                boolean bono = rs.getBoolean("bono_cum");
                System.out.println("Bono: "+bono);
                DetalleAcumulacionEntity acumulacion = new DetalleAcumulacionEntity(id, tipo, puntos, fecha, bono);
                detalles.add(acumulacion);   
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
        return detalles;
    }
}
