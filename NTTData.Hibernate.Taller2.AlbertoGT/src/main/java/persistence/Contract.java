package persistence;

import java.beans.Transient;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "CONTRATO")
public class Contract extends AbstractEntity implements Serializable{
	
	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Identificador (PK) */
	private Long contractId;
	
	/**Fecha de vigencia*/
	private Date fechaVigencia;
	
	/**Fecha de caducidad*/
	private Date fechaCaducidad;

	/** Precio mensual del cliente*/
	private String salary;

	/** cliente asociado (FK) */
	private cliente cliente;

	/**
	 * @return the contractId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CONTRACT_ID")
	public Long getContractId() {
		return contractId;
	}

	/**
	 * @param contractId
	 *            the contractId to set
	 */
	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	/**
	 * @return the salary
	 */
	@Column(name = "SALARY", nullable = false)
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * @return the cliente
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CLIENTE_ID", referencedColumnName = "CLIENTE_ID")
	public cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	@Column(name = "FECHA_VIGENCIA")
	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	@Column(name = "FECHA_CADUC")
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	@Transient
	public Class<?> getClase() {
		return Contract.class;
	}

	@Override
	public String toString() {
		return "Contract [contractId=" + contractId + ", fechaVigencia=" + fechaVigencia + ", fechaCaducidad="
				+ fechaCaducidad + ", salary=" + salary + ", cliente=" + cliente + "]";
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
