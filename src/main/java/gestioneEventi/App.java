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

		// - - - - - - - - - - - - - - - - - - - - OBJECTS CREATION
		// public Evento(String _titolo, LocalDate _dataEvento, String _descrizione,
		// TipoEvento _tipoEvento,
		// int _numeroMassimoPartecipanti)
		LocalDate primaData = LocalDate.of(2023, 7, 1);
		Evento primoEvento = new Evento("primoEvento", primaData, "primaDescrizione", TipoEvento.PRIVATO, 100);

		EventoDAO eventoDao = new EventoDAO(entityManager);

		// - - - - - - - - - - - - - - - - - - - - SAVE
		System.out.println("");
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - eventoDAO.save");
		System.out.println("");
		eventoDao.save(primoEvento);
		System.out.println("");
		System.out.println("Nel database sono stati salvati i seguenti oggetti:");
		System.out.println(primoEvento);

		// - - - - - - - - - - - - - - - - - - - - FIND BY ID
		System.out.println("");
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - eventoDAO.findById");
		System.out.println("");
		Evento eventoCercato = eventoDao.findById(0);
		System.out.println("Nel database è presente il seguente oggetto con id = " + eventoCercato.getId());
		System.out.println(eventoCercato);

		// - - - - - - - - - - - - - - - - - - - - FIND BY ID AND DELETE

		Evento eventoDaCancellare = eventoDao.findById(0);

		System.out.println("");
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - eventoDAO.findByIdAndDelete");
		System.out.println("");
		eventoDao.findByIdAndDelete(0);
		System.out
				.println("Nel database è stato cancellato il seguente oggetto con id = " + eventoDaCancellare.getId());
		System.out.println(eventoDaCancellare);

		// - - - - - - - - - - - - - - - - - - - - REFRESH

	}

}
