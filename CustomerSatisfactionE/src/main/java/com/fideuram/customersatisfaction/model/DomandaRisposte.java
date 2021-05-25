package com.fideuram.customersatisfaction.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "domanda_risposte")
public class DomandaRisposte {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "domanda_id", referencedColumnName = "id")
	private DomandaE domanda;

	@ManyToMany(mappedBy = "domandaRisposte")
	List<RispostaE> risposte;

	@Column(name = "min_risposte")
	private Integer minRisposte;

	@Column(name = "max_risposte", nullable = false)
	private Integer maxRisposte;

	@Column(name = "valutazione", nullable = true)
	private Integer valutazione;

	public DomandaRisposte() {
		super();
	}

	public DomandaRisposte(Long id, DomandaE domanda, List<RispostaE> risposte, Integer minRisposte,
			Integer maxRisposte, Integer valutazione) {
		
		this.domanda = domanda;
		this.risposte = risposte;
		this.minRisposte = minRisposte;
		this.maxRisposte = maxRisposte;
		this.valutazione = valutazione;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DomandaE getDomanda() {
		return domanda;
	}

	public void setDomanda(DomandaE domanda) {
		this.domanda = domanda;
	}

	public List<RispostaE> getRisposte() {
		if (risposte == null) {
			risposte = new ArrayList<>();
		}
		return risposte;
	}

	public void setRisposte(List<RispostaE> risposte) {
		if (risposte == null) {
			risposte = new ArrayList<>();
		}
		this.risposte = risposte;
	}

	public Integer getMinRisposte() {
		return minRisposte;
	}

	public void setMinRisposte(Integer minRisposte) {
		this.minRisposte = minRisposte;
	}

	public Integer getMaxRisposte() {
		return maxRisposte;
	}

	public void setMaxRisposte(Integer maxRisposte) {
		this.maxRisposte = maxRisposte;
	}

	public Integer getValutazione() {

		return valutazione;
	}

	public void setValutazione(Integer valutazione) {
		this.valutazione = valutazione;
	}

}
