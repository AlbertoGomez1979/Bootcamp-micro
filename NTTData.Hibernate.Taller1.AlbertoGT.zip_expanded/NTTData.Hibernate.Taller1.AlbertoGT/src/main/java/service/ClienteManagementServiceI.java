package service;

import java.util.List;

import persistence.cliente;

public interface ClienteManagementServiceI {
	
	/**
	 * inserta un nuevo cliente
	 * @param newcliente
	 */
	public void insertNewCliente(final cliente newcliente);
	
	/**
	 * actualiza un cliente
	 * @param newcliente
	 */
	public void updateCliente(final cliente updateCliente);
	
	/**
	 * Borra un cliente
	 * @param deletedCliente
	 */
	public void deleteCliente(final cliente deletedCliente);
	
	/**
	 * busca un cliente por ID
	 * @param clienteid
	 * @return
	 */
	public cliente searchById(final long clienteid);
	
	/**
	 * Saca una lista de todos los clientes
	 * @return
	 */
	public List<cliente> searchAll();

}
