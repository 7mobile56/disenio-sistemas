package com.umg.diseno.sistemas.eis.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuario extends AbstractBO {

    private static final long serialVersionUID = 1L;
	private Integer idUsuario;
	private EstadoUsuario idEstado;
	private String username;
	private String password;
	private Date fechaCreacion;
	private Date ultimoLogin;
	private Boolean bloqueado;
	private Persona personaId;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_estado")
	public EstadoUsuario getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(EstadoUsuario idEstado) {
		this.idEstado = idEstado;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getUltimoLogin() {
		return ultimoLogin;
	}
	public void setUltimoLogin(Date ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}
	public Boolean getBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;
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
