package com.fideuram.customersatisfaction.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Domanda")
public class DomandaE implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String Descrizione;
	
//	@Column(name = "min_risposte", nullable = false)
//	private Integer minRisposte;
//
//	@Column(name = "max_risposte", nullable = false)
//	private Integer maxRisposte;
//
//	@Column(name = "valutazione", nullable = true)
//	private Integer valutazione;

	public DomandaE() {
		
	}

	public DomandaE(Long id, String descrizione) {
		super();
		this.id = id;
		Descrizione = descrizione;
	}

}
