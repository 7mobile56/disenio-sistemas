package com.umg.diseno.sistemas.eis.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mantenimiento extends AbstractBO {

    private static final long serialVersionUID = 1L;
	private Integer id;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	private Orden ordenId;
	private Integer idTipoMantenimiento;
	
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
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
    @ManyToOne ()   
    @JoinColumn(name = "orden_id")
	public Orden getOrdenId() {
		return ordenId;
	}
	public void setOrdenId(Orden ordenId) {
		this.ordenId = ordenId;
	}
	
    @ManyToOne (targetEntity = TipoMantenimiento.class)          
    @JoinColumn(name = "idTipoMantenimiento")
	public Integer getIdTipoMantenimiento() {
		return idTipoMantenimiento;
	}
	public void setIdTipoMantenimiento(Integer idTipoMantenimiento) {
		this.idTipoMantenimiento = idTipoMantenimiento;
	}
	
	
	
}
