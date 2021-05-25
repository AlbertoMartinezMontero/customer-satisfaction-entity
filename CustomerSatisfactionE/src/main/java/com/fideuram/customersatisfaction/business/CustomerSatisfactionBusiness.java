package com.fideuram.customersatisfaction.business;

import com.fideuram.customersatisfaction.model.Questionario;

public interface CustomerSatisfactionBusiness {
	Boolean checkSurveyExists(String codiceFiscale, Long tipoQuestionario);
	Questionario getSurvey(Long tipoQuestionario);
	void saveSurvey(String codiceFiscale, Long tipoQuestionario, Questionario questionario);

}
