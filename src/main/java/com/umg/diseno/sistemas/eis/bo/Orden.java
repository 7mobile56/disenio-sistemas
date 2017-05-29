package com.umg.diseno.sistemas.eis.bo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orden extends AbstractBO {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String descripcion;
	private Date fecha;
	private Integer solicitudId;
	private Integer registroMaquinitaId;
	private Integer idEmpleado;
	
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
    @ManyToOne
    @JoinColumn(name = "solicitud_id")
	public Integer getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(Integer solicitudId) {
		this.solicitudId = solicitudId;
	}
	
    @ManyToOne
    @JoinColumn(name = "registroMaquinita_id")
	public Integer getRegistroMaquinitaId() {
		return registroMaquinitaId;
	}
	public void setRegistroMaquinitaId(Integer registroMaquinitaId) {
		this.registroMaquinitaId = registroMaquinitaId;
	}
    @ManyToOne
    @JoinColumn(name = "empleados_id_empleado")
	public Integer getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
    
}
