/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jwsb1
 */
public class DetalleAcumulacionEntity {
    private Integer id;
    private String NroRecibo;
    private String TipoAcumulacion;
    private int puntosObtenidos;

    public DetalleAcumulacionEntity(String NroRecibo, String TipoAcumulacion, int puntosObtenidos) {
        this.NroRecibo = NroRecibo;
        this.TipoAcumulacion = TipoAcumulacion;
        this.puntosObtenidos = puntosObtenidos;
    }
    
    public DetalleAcumulacionEntity(Integer id, String NroRecibo, String TipoAcumulacion, int puntosObtenidos) {
        this.id = id;
        this.NroRecibo = NroRecibo;
        this.TipoAcumulacion = TipoAcumulacion;
        this.puntosObtenidos = puntosObtenidos;
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

    public String getTipoAcumulacion() {
        return TipoAcumulacion;
    }

    public void setTipoAcumulacion(String TipoAcumulacion) {
        this.TipoAcumulacion = TipoAcumulacion;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObteneidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }
}
