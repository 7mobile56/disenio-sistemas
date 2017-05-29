package com.umg.diseno.sistemas.eis.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Maquinita extends AbstractBO {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String codigoSerie;
	private String decripcion;
	private TipoMaquinita tipoMaquinita;
	private MaquinitaComision comision;
	private Cliente cliente;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoSerie() {
		return codigoSerie;
	}
	public void setCodigoSerie(String codigoSerie) {
		this.codigoSerie = codigoSerie;
	}
	public String getDecripcion() {
		return decripcion;
	}
	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}
	
    @ManyToOne
    @JoinColumn(name = "tipo_maquinita_id")
	public TipoMaquinita getTipoMaquinita() {
		return tipoMaquinita;
	}
	public void setTipoMaquinita(TipoMaquinita tipoMaquinita) {
		this.tipoMaquinita = tipoMaquinita;
	}
	
    @ManyToOne
    @JoinColumn(name = "convenio_id")
	public MaquinitaComision getComision() {
		return comision;
	}
	public void setComision(MaquinitaComision comision) {
		this.comision = comision;
	}
	
    @ManyToOne
    @JoinColumn(name = "cliente_id")
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
}
