package com.umg.diseno.sistemas.eis.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RegistroMaquinita extends AbstractBO {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String ubicacion;
	private Date fechaPuesta;
	private Integer estadoMaquinitaId;
	private Integer maquinitaId;
	private Integer tipoMaquinitaId;
	private Integer clienteId;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Date getFechaPuesta() {
		return fechaPuesta;
	}
	public void setFechaPuesta(Date fechaPuesta) {
		this.fechaPuesta = fechaPuesta;
	}
	
    @ManyToOne
    @JoinColumn(name = "estadoMaquinita_id")
	public Integer getEstadoMaquinitaId() {
		return estadoMaquinitaId;
	}
	public void setEstadoMaquinitaId(Integer estadoMaquinitaId) {
		this.estadoMaquinitaId = estadoMaquinitaId;
	}
	
    @ManyToOne
    @JoinColumn(name = "maquinita_id")
	public Integer getMaquinitaId() {
		return maquinitaId;
	}
	public void setMaquinitaId(Integer maquinitaId) {
		this.maquinitaId = maquinitaId;
	}
	
    @ManyToOne
    @JoinColumn(name = "maquinita_tipo_maquinita_id")
	public Integer getTipoMaquinitaId() {
		return tipoMaquinitaId;
	}
	public void setTipoMaquinitaId(Integer tipoMaquinitaId) {
		this.tipoMaquinitaId = tipoMaquinitaId;
	}
	
    @ManyToOne
    @JoinColumn(name = "cliente_id")
	public Integer getClienteId() {
		return clienteId;
	}
	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

}
