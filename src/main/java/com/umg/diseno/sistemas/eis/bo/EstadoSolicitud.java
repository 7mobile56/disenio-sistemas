package com.umg.diseno.sistemas.eis.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EstadoSolicitud extends AbstractBO {

    private static final long serialVersionUID = 1L;

	private Integer idEstado;
	private String descripcion;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
