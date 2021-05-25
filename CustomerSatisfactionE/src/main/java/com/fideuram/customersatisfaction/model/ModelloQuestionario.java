package com.fideuram.customersatisfaction.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="modello-questionario")
public class ModelloQuestionario {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="descrizione")
	private String descrizione;
	
	@ManyToMany
	@JoinColumn(name = "categorie-con-domande", referencedColumnName = "id")
	private List<CategoriaConDomande> categorie;
	
	@Column(name="ordine-categoria")
	List<Integer>ordineCategorie;

	public ModelloQuestionario() {
	}

	public ModelloQuestionario(String descrizione, List<CategoriaConDomande> categorie, List<Integer> ordineCategorie) {
		this.descrizione = descrizione;
		this.categorie = categorie;
		this.ordineCategorie = ordineCategorie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<CategoriaConDomande> getCategorie() {
		return categorie;
	}

	public void setCategorie(List<CategoriaConDomande> categorie) {
		this.categorie = categorie;
	}

	public List<Integer> getOrdineCategorie() {
		return ordineCategorie;
	}

	public void setOrdineCategorie(List<Integer> ordineCategorie) {
		this.ordineCategorie = ordineCategorie;
	}
	
	
}
