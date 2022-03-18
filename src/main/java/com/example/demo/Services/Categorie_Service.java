package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modeles.Categorie;
import com.example.demo.Repositories.Categorie_Repository;

@Service
public class Categorie_Service {

	@Autowired
	Categorie_Repository categorie_repository;

	public Categorie addCategorie(Categorie cat) {
		return (Categorie) categorie_repository.save(cat);
	}

	public List<Categorie> read() {
		return categorie_repository.findAll();
	}

	public Optional<Categorie> searchById(int id) {
		return categorie_repository.findById(id);

	}

	public void delete(int id) {
		categorie_repository.deleteById(id);

	}
}
