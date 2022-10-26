package persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Taller 1 hibernate
 * 
 * @author agometej entidad cliente
 */
@Entity
@Table(name = "Cliente")
public class cliente extends AbstractEntity implements Serializable {
	
	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;
	
	/**ID CLIENTE*/
	private long clienteId;
	
	/**ATRIBUTOS DE CLIENTE*/
	private String nombre, apellido1, apellido2, dni;
	
	/**RELATIVO A LOS CONTRATOS DEL CLIENTE*/
	private Contract contrato;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CLIENTE_ID")
	public long getClienteId() {
		return clienteId;
	}

	public void setClienteId(long clienteId) {
		this.clienteId = clienteId;
	}

	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "APELLIDO1")
	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Column(name = "APELLIDO2")
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Column(name = "DNI", nullable = false, unique = true)
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CONTRACT_ID", referencedColumnName = "CONTRACT_ID")
	public Contract getContrato() {
		return contrato;
	}

	public void setContrato(Contract contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "cliente [clienteId=" + clienteId + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + "]";
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
