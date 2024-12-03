/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.sql.Date;

/**
 *
 * @author jwsb1
 */
public class DetalleAcumulacionEntity {
    private Integer id;
    private Integer idvendedor;
    private Integer venta;
    private Integer idtipoacum;
    private Integer puntos;
    private Date fecha_acum;
    private boolean bono_cum;

    public DetalleAcumulacionEntity() {
    }

    public DetalleAcumulacionEntity(Integer id, Integer idtipoacum, Integer puntos, Date fecha_acum, boolean bono_cum) {
        this.id = id;
        this.idtipoacum = idtipoacum;
        this.puntos = puntos;
        this.fecha_acum = fecha_acum;
        this.bono_cum = bono_cum;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(Integer idvendedor) {
        this.idvendedor = idvendedor;
    }

    public Integer getVenta() {
        return venta;
    }

    public void setVenta(Integer venta) {
        this.venta = venta;
    }

    public Integer getIdtipoacum() {
        return idtipoacum;
    }

    public void setIdtipoacum(Integer idtipoacum) {
        this.idtipoacum = idtipoacum;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Date getFecha_acum() {
        return fecha_acum;
    }

    public void setFecha_acum(Date fecha_acum) {
        this.fecha_acum = fecha_acum;
    }

    public boolean isBono_cum() {
        return bono_cum;
    }

    public void setBono_cum(boolean bono_cum) {
        this.bono_cum = bono_cum;
    }

    
}
