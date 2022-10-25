package persistence;

import java.util.List;

/**
 * Hibernate taller 1
 * @author agometej
 *Dao específico de cliente
 */

public interface clienteDaoI {
	
	/**
	 * Inserta un cliente
	 * @param cliente
	 */
	public void insert(final cliente cliente);
	
	/**
	 * Actualiza un cliente
	 * @param cliente
	 */
	public void update(final cliente cliente);
	
	/**
	 * Borra un cliente
	 * @param cliente
	 */
	public void delete(final cliente cliente);
	
	/**
	 * Busqueda de cliente por ID
	 * @param id
	 * @return
	 */
	public cliente searchById(final long id);
	
	/**
	 * Busca todos los clientes
	 * @return
	 */
	public List<cliente> searchAll();

}
