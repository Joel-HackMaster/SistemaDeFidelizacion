/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jwsb1
 */
public class BaseEntity {
    private int id;
    private String nombres;
    private String dni;
    private String apellidos;
    private String correo;
    private String password;

    public BaseEntity() {
    }
    
    public BaseEntity(int id) {
        this.id = id;
    }
    
    public BaseEntity(String nombres, String dni, String apellidos, String correo) {
        this.nombres = nombres;
        this.dni = dni;
        this.apellidos = apellidos;
        this.correo = correo;
    }
    
    public BaseEntity(int id, String nombres, String apellidos, String correo,String password) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
    }

    public BaseEntity(int id, String nombres, String apellidos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    public BaseEntity(String nombres, String apellidos, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public BaseEntity(Integer id, String nombres, String dni, String apellidos, String correo, String password) {
        this.id = id;
        this.nombres = nombres;
        this.dni = dni;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
