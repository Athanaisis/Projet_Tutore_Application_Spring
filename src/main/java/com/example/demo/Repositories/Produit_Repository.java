package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Modeles.Produit;

public interface Produit_Repository extends JpaRepository<Produit, Integer> {

	List<Produit> findByTitre(String titre);

}
