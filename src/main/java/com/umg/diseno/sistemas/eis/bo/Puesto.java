package com.umg.diseno.sistemas.eis.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Puesto extends AbstractBO {

    private static final long serialVersionUID = 1L;

	private Integer idPuesto;
	private String descripcion;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdPuesto() {
		return idPuesto;
	}
	public void setIdPuesto(Integer idPuesto) {
		this.idPuesto = idPuesto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
