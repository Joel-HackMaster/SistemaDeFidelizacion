/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jwsb1
 */
public class CanjeEntity {
    private Integer id;
    private String NroRecibo;
    private String Producto;

    public CanjeEntity() {
    }

    public CanjeEntity(String NroRecibo, String Producto) {
        this.NroRecibo = NroRecibo;
        this.Producto = Producto;
    }
    
    public CanjeEntity(Integer id, String NroRecibo, String Producto) {
        this.id = id;
        this.NroRecibo = NroRecibo;
        this.Producto = Producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNroRecibo() {
        return NroRecibo;
    }

    public void setNroRecibo(String NroRecibo) {
        this.NroRecibo = NroRecibo;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }
}
