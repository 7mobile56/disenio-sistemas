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
	private TipoSolicitud tipoSolicitudId;
	private Cliente clienteId;
	private EstadoSolicitud idEstado;
	private Usuario idUsuario;
	
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
	@JoinColumn(name = "tipo_solicitud_id")
	public TipoSolicitud getTipoSolicitudId() {
		return tipoSolicitudId;
	}
	public void setTipoSolicitudId(TipoSolicitud tipoSolicitudId) {
		this.tipoSolicitudId = tipoSolicitudId;
	}
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	public Cliente getClienteId() {
		return clienteId;
	}
	public void setClienteId(Cliente clienteId) {
		this.clienteId = clienteId;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_estado")
	public EstadoSolicitud getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(EstadoSolicitud idEstado) {
		this.idEstado = idEstado;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	
}
