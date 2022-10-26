package persistence;



import org.hibernate.Session;

public class clienteDaoImpl extends CommonDaoImpl<cliente>implements clienteDaoI {

	/** Sesión de conexión a BD */
	private Session session;

	/**
	 * Método constructor
	 */
	public clienteDaoImpl(Session session) {
		super(session);
		this.session = session;
	}


}
