package it.corso.service;

import java.util.List;

import it.corso.model.Prodotto;

public interface ProdottoService {

	//CRUD create read update delete
	void registraProdotto(Prodotto prodotto);
	Prodotto getProdottoById (int id);
	List<Prodotto> getProdotti(); 
	void cancellaProdotto(Prodotto prodotto); 
	
	List<Prodotto> trovameliPerPrezzo(double prezzo);   
}
