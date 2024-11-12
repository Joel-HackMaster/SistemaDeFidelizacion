/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.AdministradorEntity;

/**
 *
 * @author jwsb1
 */
public class AdministradorDAO {
    private Connection connection;

    public AdministradorDAO(Connection connection) {
        this.connection = connection;
    }
    
    public AdministradorEntity obtenerUsuarioPorCredenciales(String correo) {
        AdministradorEntity admin = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
          String sql = "SELECT id, nombres, apellidos, correo, password FROM tt_administrador WHERE correo = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();
            
            if(rs.next()){
                admin = new AdministradorEntity(rs.getInt("id"), rs.getString("nombres"), rs.getString("apellidos"), rs.getString("correo"),rs.getString("password"));
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
        return admin;
    }
    
}
