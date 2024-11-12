/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jwsb1
 */
public class VentaEntity {
    Integer id;
    Integer idVendedor;
    Integer idProducto;
    String nombreCliente;
    float montoVenta;
    String fecha;
    String detalleVenta;

    public VentaEntity(Integer idVendedor, Integer idProducto, String nombreCliente, float montoVenta, String fecha, String detalleVenta) {
        this.idVendedor = idVendedor;
        this.idProducto = idProducto;
        this.nombreCliente = nombreCliente;
        this.montoVenta = montoVenta;
        this.fecha = fecha;
        this.detalleVenta = detalleVenta;
    }
    

    public VentaEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public float getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(float montoVenta) {
        this.montoVenta = montoVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(String detalleVenta) {
        this.detalleVenta = detalleVenta;
    }
    
    
}
