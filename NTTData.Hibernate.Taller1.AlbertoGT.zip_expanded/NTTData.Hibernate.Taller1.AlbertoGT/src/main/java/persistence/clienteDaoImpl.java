package persistence;

import java.util.List;

import org.hibernate.Session;

public class clienteDaoImpl implements clienteDaoI {
	/**
	 * Variable para la sesión de conexión
	 */
	private Session session;

	private Class<cliente> entityClass;

	/**
	 * Constructor
	 * 
	 * @param session
	 */
	public clienteDaoImpl(Session session) {
		super();
		this.session = session;
	}

	@Override
	public void insert(cliente cliente) {

		// Verificación de session abierta.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Insercción.
		session.save(cliente);
		session.flush();

		// Commit.
		session.getTransaction().commit();

	}

	@Override
	public void update(cliente cliente) {
		// Verificación de sesión abierta.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Insercción.
		session.saveOrUpdate(cliente);

		// Commit.
		session.getTransaction().commit();

	}

	@Override
	public void delete(cliente cliente) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Insercción.
		session.delete(cliente);

		// Commit.
		session.getTransaction().commit();

	}

	@Override
	public cliente searchById(long id) {

		// Verificación de sesión abierta.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// localiza el cliente por el id
		// Búsqueda por PK.
		cliente result = session.get(this.entityClass, id);

		return result;
	}

	

	@Override
	public List<cliente> searchAll() {
		// Verificación de sesión abierta.
				if (!session.getTransaction().isActive()) {
					session.getTransaction().begin();
				}

				// Búsqueda de todos los registros.
				List<cliente> list = session.createQuery("FROM " + this.entityClass.getName()).list();

				return list;
		
	}
}
