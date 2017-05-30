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
	private Date fecha;
	private Maquinita maquinitaId;
	private Cliente clienteId;
	private BigDecimal monto;
	private Persona empleadoId; // El empleado que colecto la recaudacion.
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
    @JoinColumn(name = "cliente_id")
	public Cliente getClienteId() {
		return clienteId;
	}
	public void setClienteId(Cliente clienteId) {
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
	public Persona getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(Persona empleadoId) {
		this.empleadoId = empleadoId;
	}
	
	
}
