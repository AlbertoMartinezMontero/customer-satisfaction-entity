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
@Table(name = "tipo-questionario")
public class TipoQuestionario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="descrizione")
	private String descrizione;

	public TipoQuestionario() {
	}

	public TipoQuestionario(Long id, String descrizione) {
		this.id = id;
		this.descrizione = descrizione;
	}
	
	

}
