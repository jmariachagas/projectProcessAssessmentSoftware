package br.edu.unipampa.jonas.chagas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unipampa.jonas.chagas.domain.Assessment;

public interface AssessmentRepository extends JpaRepository<Assessment, Long>{
	

}
