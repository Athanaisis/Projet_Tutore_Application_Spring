package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modeles.Produit;
import com.example.demo.Repositories.Produit_Repository;

@Service
public class Produit_Service {

	@Autowired
	Produit_Repository produit_repository;

	public Produit addProduit(Produit prod) {
		return (Produit) produit_repository.save(prod);
	}

	public List<Produit> read() {
		return produit_repository.findAll();
	}

	public Optional<Produit> searchById(int id) {
		return produit_repository.findById(id);

	}

	public void delete(int id) {
		produit_repository.deleteById(id);

	}

	// Méthode Personnalisée pour la recherche par titre de produit

	public List<Produit> rechercheParTitre(String titre) {
		return produit_repository.findByTitre(titre);
	}
}
