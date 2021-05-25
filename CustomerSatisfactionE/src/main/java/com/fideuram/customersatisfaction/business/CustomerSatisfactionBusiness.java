package com.fideuram.customersatisfaction.business;

import com.fideuram.customersatisfaction.model.ModelloQuestionario;
import com.fideuram.customersatisfaction.model.QuestionarioCompilatoE;

public interface CustomerSatisfactionBusiness {
	Boolean checkSurveyExists(String codiceFiscale, Long tipoQuestionario);
	ModelloQuestionario getSurvey(Long tipoQuestionario);
	void saveSurvey(String codiceFiscale, Long tipoQuestionario, QuestionarioCompilatoE questionario);

}
