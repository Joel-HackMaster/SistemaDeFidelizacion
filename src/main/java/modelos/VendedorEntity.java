/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jwsb1
 */
public class VendedorEntity extends BaseEntity{
    Integer puntosxacum;
    Integer puntosxbon;

    public VendedorEntity(Integer puntosxacum, Integer puntosxbon, Integer id, String nombres, String dni, String apellidos, String correo, String password) {
        super(id, nombres, dni, apellidos, correo, password);
        this.puntosxacum = puntosxacum;
        this.puntosxbon = puntosxbon;
    }
    
    public VendedorEntity(String nombres, String apellidos, String correo, String dni, Integer puntosxacum, Integer puntosxbon) {
        super(nombres, dni, apellidos, correo);
        this.puntosxacum = puntosxacum;
        this.puntosxbon = puntosxbon;
    }
    
    

    public VendedorEntity(int id, String nombres, String apellidos) {
        super(id, nombres, apellidos);
    }

    public Integer getPuntosxacum() {
        return puntosxacum;
    }

    public void setPuntosxacum(Integer puntosxacum) {
        this.puntosxacum = puntosxacum;
    }

    public Integer getPuntosxbon() {
        return puntosxbon;
    }

    public void setPuntosxbon(Integer puntosxbon) {
        this.puntosxbon = puntosxbon;
    }
    
    
}
