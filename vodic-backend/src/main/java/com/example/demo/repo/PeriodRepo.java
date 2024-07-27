package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Period;

public interface PeriodRepo extends JpaRepository<Period, Integer> {
	
	Optional<Period> findbyNazivPocetakKraj(String naziv, int pocetak_perioda, int kraj_perioda);

}
