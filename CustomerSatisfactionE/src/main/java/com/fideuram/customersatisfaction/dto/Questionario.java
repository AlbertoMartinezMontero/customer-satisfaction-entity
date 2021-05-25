package com.fideuram.customersatisfaction.dto;

import lombok.Data;

@Data
public class Questionario {

	private Long id;
	private Long Domanda;
	private Long tipoQuestionario;
	private Long risposta;
	private Long categoria;
	private Integer ordineCategoria;
	private Integer ordineDomanda;
	private Integer ordineRisposta;

	
}
