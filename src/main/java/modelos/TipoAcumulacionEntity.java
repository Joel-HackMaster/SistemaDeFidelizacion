/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jwsb1
 */
public class TipoAcumulacionEntity {
    private Integer id;
    private String descripcion;

    public TipoAcumulacionEntity() {
    }

    public TipoAcumulacionEntity(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoAcumulacionEntity(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
