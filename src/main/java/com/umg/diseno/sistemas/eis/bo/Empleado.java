package com.umg.diseno.sistemas.eis.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Empleado extends AbstractBO {

    private static final long serialVersionUID = 1L;

	private Integer idEmpleado;
	private Integer idPuesto;
	private Integer idUsuario;
	private Integer personaId;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
    @ManyToOne
    @JoinColumn(name = "id_puesto")
	public Integer getIdPuesto() {
		return idPuesto;
	}
	public void setIdPuesto(Integer idPuesto) {
		this.idPuesto = idPuesto;
	}
	
    @ManyToOne
    @JoinColumn(name = "id_usuario")
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
    @ManyToOne
    @JoinColumn(name = "persona_id")
	public Integer getPersonaId() {
		return personaId;
	}
	public void setPersonaId(Integer personaId) {
		this.personaId = personaId;
	}
	
	
    
}
