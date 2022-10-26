package persistence;

import java.util.List;
import org.hibernate.Session;


public class ContractDaoImpl extends CommonDaoImpl<Contract> implements ContractDaoI{
	
	/** Sesión de conexión a BD */
	private Session session;
	
	private cliente cliente;

	/**
	 * Método constructor
	 */
	public ContractDaoImpl(Session session) {
		super(session);
		this.session = session;
	}

	/**METODO PROPIO PARA BUSCAR CLIENTE POR ID*/
	@SuppressWarnings("unchecked")
	@Override
	public List<cliente> searchByclienteId(final long Id) {
		// Verificación de sesión abierta.
				if (!session.getTransaction().isActive()) {
					session.getTransaction().begin();
				}

				// Localiza jugadores en función del nombre.
				final List<cliente> clienteList = session.createQuery("FROM Cliente WHERE CLIENTE_ID=" + Id).list();

				return clienteList;
	}


}
