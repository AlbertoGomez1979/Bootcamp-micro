package persistence;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;

public class CommonDaoImpl<T extends AbstractEntity> implements CommonDaoI<T>{
	
	/** Tipo de clase */
	private Class<T> entityClass;

	/** Sesión de conexión a BD */
	private Session session;
	
	@SuppressWarnings("unchecked")
	public CommonDaoImpl(Session session) {
		setEntityClass((Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
		this.session = session;
	}

	@Override
	public void insert(T paramT) {
		// Verificación de sesión abierta.
				if (!session.getTransaction().isActive()) {
					session.getTransaction().begin();
				}

				// Insercción.
				session.save(paramT);
				session.flush();

				// Commit.
				session.getTransaction().commit();		
	}

	@Override
	public void update(T paramT) {
		// Verificación de sesión abierta.
				if (!session.getTransaction().isActive()) {
					session.getTransaction().begin();
				}

				// Insercción.
				session.saveOrUpdate(paramT);

				// Commit.
				session.getTransaction().commit();	
	}

	@Override
	public void delete(T paramT) {
		// Verificación de sesión abierta.
				if (!session.getTransaction().isActive()) {
					session.getTransaction().begin();
				}

				// Insercción.
				session.delete(paramT);

				// Commit.
				session.getTransaction().commit();		
	}

	@Override
	public T searchById(Long id) {
		// Verificación de sesión abierta.
				if (!session.getTransaction().isActive()) {
					session.getTransaction().begin();
				}

				// Búsqueda por PK.
				T result = session.get(this.entityClass, id);

				return result;
	}

	@Override
	public List<T> searchAll() {
		// Verificación de sesión abierta.
				if (!session.getTransaction().isActive()) {
					session.getTransaction().begin();
				}

				// Búsqueda de todos los registros.
				List<T> list = session.createQuery("FROM " + this.entityClass.getName()).list();

				return list;
	}
	
	public Class<T> getEntityClass() {
		return entityClass;
	}
	
	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	
	

}
