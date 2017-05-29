package com.umg.diseno.sistemas.eis.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ReporteMaquinita extends AbstractBO {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String descripcion;
	private Date fechaElaboracion;
	private Integer estadoMaquinitaId;
	private Integer mantenimientoId;
	
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
	public Date getFechaElaboracion() {
		return fechaElaboracion;
	}
	public void setFechaElaboracion(Date fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
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
    @JoinColumn(name = "mantenimiento_id")
	public Integer getMantenimientoId() {
		return mantenimientoId;
	}
	public void setMantenimientoId(Integer mantenimientoId) {
		this.mantenimientoId = mantenimientoId;
	}

}
