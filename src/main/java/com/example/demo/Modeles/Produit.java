package com.example.demo.Modeles;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Produit implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private String titre;

	@Lob
	private String description;

	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private String livraison;

	@OneToMany(cascade = CascadeType.ALL)
	List<Categorie> categorie;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLivraison() {
		return livraison;
	}

	public void setLivraison(String livraison) {
		this.livraison = livraison;
	}

	public List<Categorie> getCategorie() {
		return categorie;
	}

	public void setCategorie(List<Categorie> categorie) {
		this.categorie = categorie;
	}

	public Produit() {

	}

	public Produit(int id, String titre, String description, String livraison, List<Categorie> categorie) {

		this.id = id;
		this.titre = titre;
		this.description = description;
		this.livraison = livraison;
		this.categorie = categorie;
	}

	public Produit(String titre, String description, String livraison, List<Categorie> categorie) {

		this.titre = titre;
		this.description = description;
		this.livraison = livraison;
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", titre=" + titre + ", description=" + description + ", livraison=" + livraison
				+ ", categorie=" + categorie + "]";
	}

}
