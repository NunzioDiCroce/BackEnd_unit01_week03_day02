package gestioneEventi;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventi")

public class Evento {

	// id (chiave primaria)
	// titolo
	// dataEvento
	// descrizione
	// tipoEvento [PUBBLICO, PRIVATO]
	// numeroMassimoPartecipanti

	@Id
	private long id;
	private String titolo;
	private LocalDate dataEvento;

	// costruttori, getters e setters...

}
