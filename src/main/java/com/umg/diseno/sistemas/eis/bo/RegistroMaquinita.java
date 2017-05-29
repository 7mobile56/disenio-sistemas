package com.umg.diseno.sistemas.eis.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RegistroMaquinita extends AbstractBO {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String ubicacion;
	private Date fechaPuesta;
	private EstadoMaquinita estadoMaquinitaId;
	private Maquinita maquinitaId;
	private TipoMaquinita tipoMaquinitaId;
	private Cliente clienteId;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Date getFechaPuesta() {
		return fechaPuesta;
	}
	public void setFechaPuesta(Date fechaPuesta) {
		this.fechaPuesta = fechaPuesta;
	}
	
    @ManyToOne
    @JoinColumn(name = "estadoMaquinita_id")
	public EstadoMaquinita getEstadoMaquinitaId() {
		return estadoMaquinitaId;
	}
	public void setEstadoMaquinitaId(EstadoMaquinita estadoMaquinitaId) {
		this.estadoMaquinitaId = estadoMaquinitaId;
	}
	
    @ManyToOne
    @JoinColumn(name = "maquinita_id")
	public Maquinita getMaquinitaId() {
		return maquinitaId;
	}
	public void setMaquinitaId(Maquinita maquinitaId) {
		this.maquinitaId = maquinitaId;
	}
	
    @ManyToOne
    @JoinColumn(name = "maquinita_tipo_maquinita_id")
	public TipoMaquinita getTipoMaquinitaId() {
		return tipoMaquinitaId;
	}
	public void setTipoMaquinitaId(TipoMaquinita tipoMaquinitaId) {
		this.tipoMaquinitaId = tipoMaquinitaId;
	}
	
    @ManyToOne
    @JoinColumn(name = "cliente_id")
	public Cliente getClienteId() {
		return clienteId;
	}
	public void setClienteId(Cliente clienteId) {
		this.clienteId = clienteId;
	}

}
