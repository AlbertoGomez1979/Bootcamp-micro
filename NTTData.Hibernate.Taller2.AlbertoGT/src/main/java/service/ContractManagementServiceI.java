package service;

import java.util.List;

import persistence.Contract;
import persistence.cliente;



public interface ContractManagementServiceI {
	
	/**MUESTRA LISTA DE CLIENTES POR ID
	 * 
	 * @param Id
	 * @return
	 */
	public List<cliente> searchByclienteId(final long Id);
	
	/**
	 * Inserta un nuevo contrato.
	 * 
	 * @param newPlayer
	 */
	public void insertNewContract(final Contract newContract);

	/**
	 * Actualiza un contrato existente.
	 * 
	 * @param updatedPlayer
	 */
	public void updateContract(final Contract updatedContract);

	/**
	 * Elimina un contrato existente.
	 * 
	 * @param deletedPlayer
	 */
	public void deleteContract(final Contract deletedContract);

	/**
	 * Obtiene un contrato mediante su ID.
	 * 
	 * @param playerId
	 */
	public Contract searchById(final Long contractId);

	/**
	 * Obtiene todos los contratos existentes.
	 * 
	 * @return List<Contract>
	 */
	public List<Contract> searchAll();

}
