package com.fideuram.customersatisfaction.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tipo_questionario")
public class TipoQuestionarioE {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@OneToMany(mappedBy="questionario")
	List<CategoriaE> categorie;

}
