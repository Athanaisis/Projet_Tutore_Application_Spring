package com.example.demo.Modeles;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Categorie implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private String categorie;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "id_categorie", nullable = false)
	private Produit produit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Categorie() {

	}

	public Categorie(int id, String categorie, Produit produit) {

		this.id = id;
		this.categorie = categorie;
		this.produit = produit;
	}

	public Categorie(String categorie, Produit produit) {

		this.categorie = categorie;
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", categorie=" + categorie + ", produit=" + produit + "]";
	}

}
