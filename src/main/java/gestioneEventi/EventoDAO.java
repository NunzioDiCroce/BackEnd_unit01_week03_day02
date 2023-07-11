package gestioneEventi;

import javax.persistence.EntityManager;

public class EventoDAO {

	// save
	// getById
	// delete
	// refresh

	private final EntityManager entityManager;

	public EventoDAO(EntityManager _entityManager) {
		this.entityManager = _entityManager;
	}
}
