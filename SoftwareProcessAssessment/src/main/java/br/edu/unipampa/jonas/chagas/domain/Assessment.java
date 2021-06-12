package br.edu.unipampa.jonas.chagas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Assessment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;

}
