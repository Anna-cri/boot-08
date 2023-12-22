package it.corso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.ProdottoDao;
import it.corso.model.Prodotto;

@Service
public class ProdottoServiceImpl implements ProdottoService {

	@Autowired
	private ProdottoDao prodottoDao;

	@Override
	public void registraProdotto(Prodotto prodotto) {
		prodottoDao.save(prodotto);
	}

	@Override
	public Prodotto getProdottoById(int id) {

		Optional<Prodotto> prodottoOptional = prodottoDao.findById(id);
		if (prodottoOptional.isPresent())
			return prodottoOptional.get();
		return null;
	}

	@Override
	public List<Prodotto> getProdotti() {

		return (List<Prodotto>) prodottoDao.findAll(); // va aggiunto un cast
	}

	@Override
	public void cancellaProdotto(Prodotto prodotto) {
		prodottoDao.delete(prodotto);
	}

	@Override
	public List<Prodotto> trovameliPerPrezzo(double prezzo) {

		return prodottoDao.findByPrezzo(prezzo);
	}

}
