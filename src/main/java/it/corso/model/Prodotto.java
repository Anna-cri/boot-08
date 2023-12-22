package it.corso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  //rende la classe prodotto in entity prodotto
@Table(name = "prodotti") //fai in modo che le istanze di questa classe vadano in mappatura sulla tabella "prodotti" del database 
public class Prodotto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //della gestione se ne occupa esclusiavmente il db //serve per specificare la modalita di gestione della chiave primaria 
	private int id;
	
	@Column(name = "descrizione")
	private String descrizione; 
	
	@Column(name = "prezzo")
	private double prezzo; //questi tre attributi sono compatibili con la struttura della tabella ospitante del database 
	
	//i getter / setter sono fondamentali x tutti gli attributi 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
