package service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import persistence.cliente;
import persistence.clienteDaoI;
import persistence.clienteDaoImpl;

public class ClienteManagementServiceImpl implements ClienteManagementServiceI {

	/**
	 * Dao cliente
	 */
	private clienteDaoI clienteDao;

	/**
	 * Constructor
	 * 
	 * @param session
	 */
	public ClienteManagementServiceImpl(final Session session) {
		super();
		this.clienteDao = new clienteDaoImpl(session);
	}

	@Override
	public void insertNewCliente(cliente newcliente) {
		// Verificación de nulidad e inexistencia.
		if (newcliente != null) {

			// Insercción del nuevo cliente.
			clienteDao.insert(newcliente);
		}

	}

	@Override
	public void updateCliente(cliente updateCliente) {
		// Verificación de nulidad y existencia.
		if (updateCliente != null) {

			// Actualización del cliente.
			clienteDao.update(updateCliente);
		}

	}

	@Override
	public void deleteCliente(cliente deletedCliente) {
		// Verificación de nulidad y existencia.
		if (deletedCliente != null) {

			// Eliminación del cliente.
			clienteDao.delete(deletedCliente);
		}

	}

	@Override
	public cliente searchById(long clienteid) {
		// Resultado.
		cliente cliente = null;

		// Verificación de nulidad.
		if (cliente.getDni() != null) { 

		// Obtención del cliente por ID.
		cliente = clienteDao.searchById(clienteid);
		 }

		return cliente;
	}

	@Override
	public List<cliente> searchAll() {
		// Resultado.
		List<cliente> clienteList = new ArrayList<>();

		// Obtención de todos los clientes.
		clienteList = clienteDao.searchAll();

		return clienteList;
	}

}
