package com.fideuram.customersatisfaction.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categoria-domande")
public class CategoriaConDomande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "descrizione")
	private String descrizione;

	@ManyToMany
	@JoinColumn(name = "domanda-risposte", referencedColumnName = "id")
	private List<DomandaRisposte> domandeConRisposte;

	@Column(name = "ordine-domande")
	List<Integer> ordinedomande;

	public CategoriaConDomande() {
		super();
	}

	public CategoriaConDomande(String descrizione, List<DomandaRisposte> domandeConRisposte,
			List<Integer> ordinedomande) {
		this.descrizione = descrizione;
		this.domandeConRisposte = domandeConRisposte;
		this.ordinedomande = ordinedomande;
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

	public List<DomandaRisposte> getDomandeConRisposte() {
		if (domandeConRisposte == null) {
			domandeConRisposte = new ArrayList<>();
		}
		return domandeConRisposte;
	}

	public void setDomandeConRisposte(List<DomandaRisposte> domandeConRisposte) {
		if (domandeConRisposte == null) {
			domandeConRisposte = new ArrayList<>();
		}
		this.domandeConRisposte = domandeConRisposte;
	}

	public List<Integer> getOrdinedomande() {
		if (ordinedomande == null) {
			ordinedomande = new ArrayList<>();
		}
		return ordinedomande;
	}

	public void setOrdinedomande(List<Integer> ordinedomande) {
		if (ordinedomande == null) {
			ordinedomande = new ArrayList<>();

			this.ordinedomande = ordinedomande;
		}
	}
}
