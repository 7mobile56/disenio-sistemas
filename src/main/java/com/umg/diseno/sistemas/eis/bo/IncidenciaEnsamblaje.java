package com.umg.diseno.sistemas.eis.bo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class IncidenciaEnsamblaje extends AbstractBO {

    private static final long serialVersionUID = 1L;

	private Integer idIncidencia;
	private Integer idUsuarioIngreso;
	private String descripcion;
	private Date fechaIngreso;
	private Integer idUsuarioSolvento;
	private String solucion;
	private Date fechaSolucion;
	private Integer idSolicitud;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdIncidencia() {
		return idIncidencia;
	}
	public void setIdIncidencia(Integer idIncidencia) {
		this.idIncidencia = idIncidencia;
	}
	
    @ManyToOne
    @JoinColumn(name = "id_usuario_ingreso")
	public Integer getIdUsuarioIngreso() {
		return idUsuarioIngreso;
	}
	public void setIdUsuarioIngreso(Integer idUsuarioIngreso) {
		this.idUsuarioIngreso = idUsuarioIngreso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
    @ManyToOne
    @JoinColumn(name = "id_usuario_solvento")
	public Integer getIdUsuarioSolvento() {
		return idUsuarioSolvento;
	}
	public void setIdUsuarioSolvento(Integer idUsuarioSolvento) {
		this.idUsuarioSolvento = idUsuarioSolvento;
	}
	public String getSolucion() {
		return solucion;
	}
	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}
	public Date getFechaSolucion() {
		return fechaSolucion;
	}
	public void setFechaSolucion(Date fechaSolucion) {
		this.fechaSolucion = fechaSolucion;
	}
	
    @ManyToOne
    @JoinColumn(name = "solicitud_id")
	public Integer getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
}
