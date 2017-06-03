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

	private Integer id;
	private String codigo;
	private Puesto idPuesto;
	private Usuario idUsuario;
	private Persona personaId;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
	
    @ManyToOne
    @JoinColumn(name = "id_puesto")
	public Puesto getIdPuesto() {
		return idPuesto;
	}
	
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setIdPuesto(Puesto idPuesto) {
		this.idPuesto = idPuesto;
	}
	
    @ManyToOne
    @JoinColumn(name = "id_usuario")
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	
    @ManyToOne
    @JoinColumn(name = "persona_id")
	public Persona getPersonaId() {
		return personaId;
	}
	public void setPersonaId(Persona personaId) {
		this.personaId = personaId;
	}
	
	
    
}
