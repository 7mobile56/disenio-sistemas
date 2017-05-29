package com.umg.diseno.sistemas.eis.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.Date;
import java.math.BigDecimal;

@Entity
public class Recaudacion extends AbstractBO {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private Date fechaHora;
	private Integer maquinitaId;
	private Integer clienteId;
	private BigDecimal monto;
	private Integer empleadoId; // El empleado que colecto la recaudacion.
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	
    @ManyToOne
    @JoinColumn(name = "maquinita_id")
	public Integer getMaquinitaId() {
		return maquinitaId;
	}
	public void setMaquinitaId(Integer maquinitaId) {
		this.maquinitaId = maquinitaId;
	}
	
    @ManyToOne
    @JoinColumn(name = "cliente_id")
	public Integer getClienteId() {
		return clienteId;
	}
	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
    @ManyToOne
    @JoinColumn(name = "persona_id")
	public Integer getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(Integer empleadoId) {
		this.empleadoId = empleadoId;
	}
	
	
}
