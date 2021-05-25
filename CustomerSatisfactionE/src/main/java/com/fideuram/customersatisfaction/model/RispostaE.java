package com.fideuram.customersatisfaction.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="risposta")
public class RispostaE {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@Column(name="descrizione")
private String descrizione;

}
