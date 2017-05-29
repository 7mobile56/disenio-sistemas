package com.umg.diseno.sistemas.eis.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoMaquinita extends AbstractBO {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer codigo;
	private String descripcion;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
