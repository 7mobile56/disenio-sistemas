package com.umg.diseno.sistemas.eis.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Solicitud extends AbstractBO {

    private static final long serialVersionUID = 1L;
	private Integer id;
	private String descripcion;
	private Date fechaSolicitud;
	private Integer tipoSolicitudId;
	private Integer clienteId;
	private Integer idEstado;
	private Integer idUsuario;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	
	@ManyToOne
	@JoinColumn(name = "tipoSolicitud_id")
	public Integer getTipoSolicitudId() {
		return tipoSolicitudId;
	}
	public void setTipoSolicitudId(Integer tipoSolicitudId) {
		this.tipoSolicitudId = tipoSolicitudId;
	}
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	public Integer getClienteId() {
		return clienteId;
	}
	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
	
	@ManyToOne
	@JoinColumn(name = "estados_solicitud_id_estado")
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	
	@ManyToOne
	@JoinColumn(name = "usuarios_id_usuario")
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
}
