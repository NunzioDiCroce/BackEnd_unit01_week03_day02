package gestioneEventi;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import utils.JpaUtil;

public class App {

	private static EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();

	public static void main(String[] args) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		System.out.println("");
		System.out
				.println("- - - - - - - - - - - - - - - App Gestione Eventi is running - - - - - - - - - - - - - - -");

		// public Evento(String _titolo, LocalDate _dataEvento, String _descrizione,
		// TipoEvento _tipoEvento,
		// int _numeroMassimoPartecipanti)
		LocalDate primaData = LocalDate.of(2023, 7, 1);
		Evento primoEvento = new Evento("primoEvento", primaData, "primaDescrizione", TipoEvento.PRIVATO, 100);

		EventoDAO eventoDao = new EventoDAO(entityManager);

		// - - - - - - - - - - - - - - - - - - - - SAVE
		eventoDao.save(primoEvento);

	}

}
