/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jwsb1
 */
public class AdministradorEntity extends BaseEntity{
    private int registros;

    public AdministradorEntity(int registros, Integer id, String nombres, String dni, String apellidos, String correo, String password) {
        super(id, nombres, dni, apellidos, correo, password);
        this.registros = registros;
    }

    public AdministradorEntity(int id, String nombres, String apellidos, String dni, String correo, String password) {
        super(id, nombres, dni, apellidos, correo, password);
    }

    public AdministradorEntity(int id, String nombres, String apellidos, String correo,String password) {
        super(id, nombres, apellidos, correo, password);
    }
    
    public AdministradorEntity(String nombres, String apellidos, String correo) {
        super(nombres, apellidos, correo);
    }

    public int getRegistros() {
        return registros;
    }

    public void setRegistros(int registros) {
        this.registros = registros;
    }    
}
