package com.umg.diseno.sistemas.eis.bo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class MaquinitaComision extends AbstractBO {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private TipoComisionCliente tipoComisionCliente;
	private Double factorCobro;
	private BigDecimal valorTransaccionCliente;
	private Double porcentajeCliente;
	private FrecuenciaCalculo frecuenciaCalculo;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Enumerated(EnumType.STRING)
	public TipoComisionCliente getTipoComisionCliente() {
		return tipoComisionCliente;
	}
	public void setTipoComisionCliente(TipoComisionCliente tipoComisionCliente) {
		this.tipoComisionCliente = tipoComisionCliente;
	}
	public Double getFactorCobro() {
		return factorCobro;
	}
	public void setFactorCobro(Double factorCobro) {
		this.factorCobro = factorCobro;
	}
	public BigDecimal getValorTransaccionCliente() {
		return valorTransaccionCliente;
	}
	public void setValorTransaccionCliente(BigDecimal valorTransaccionCliente) {
		this.valorTransaccionCliente = valorTransaccionCliente;
	}
	public Double getPorcentajeCliente() {
		return porcentajeCliente;
	}
	public void setPorcentajeCliente(Double porcentajeCliente) {
		this.porcentajeCliente = porcentajeCliente;
	}
	
	@Enumerated(EnumType.STRING)
	public FrecuenciaCalculo getFrecuenciaCalculo() {
		return frecuenciaCalculo;
	}

	public void setFrecuenciaCalculo(FrecuenciaCalculo frecuenciaCalculo) {
		this.frecuenciaCalculo = frecuenciaCalculo;
	}
 
	
}
