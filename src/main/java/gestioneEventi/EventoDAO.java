package gestioneEventi;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventoDAO {

	// save
	// getById
	// delete
	// refresh

	private final EntityManager entityManager;

	public EventoDAO(EntityManager _entityManager) {
		this.entityManager = _entityManager;
	}

	public void save(Evento _evento) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(_evento);
		entityTransaction.commit();
		System.out.println("Evento salvato correttamente");
	}

	public Evento findById(long _id) {
		Evento eventoCercato = entityManager.find(Evento.class, _id);
		return eventoCercato;

	}

}
