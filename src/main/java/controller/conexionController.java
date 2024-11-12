/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jwsb1
 */
public class conexionController {
    private static final String URL = "jdbc:postgresql://ep-rough-paper-a48t05iw-pooler.us-east-1.aws.neon.tech/verceldb";
    private static final String USER = "default";
    private static final String PASSWORD = "MTK0JQlBZ8Rb";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}
