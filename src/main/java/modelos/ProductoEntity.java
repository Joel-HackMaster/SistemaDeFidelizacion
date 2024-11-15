/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jwsb1
 */
public class ProductoEntity {
    Integer id;
    String descripcion;
    String detalle;
    float precio;
    Integer stock;
    Integer puntosxconv;
    Integer puntosxvent;
    String modelo;

    public ProductoEntity(Integer id, float precio) {
        this.id = id;
        this.precio = precio;
    }

    public ProductoEntity(String descripcion, String detalle, float precio, Integer stock) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.stock = stock;
    }

    public ProductoEntity(String descripcion, String detalle, Integer stock, Integer puntosxconv) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.stock = stock;
        this.puntosxconv = puntosxconv;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPuntosxconv() {
        return puntosxconv;
    }

    public void setPuntosxconv(Integer puntosxconv) {
        this.puntosxconv = puntosxconv;
    }

    public Integer getPuntosxvent() {
        return puntosxvent;
    }

    public void setPuntosxvent(Integer puntosxvent) {
        this.puntosxvent = puntosxvent;
    }

    
    
}
