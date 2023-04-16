package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.DentalManager.negocio.basica.Agenda;

@Repository
public interface ColecaoAgenda  extends JpaRepository < Agenda ,Long> {
	List <Agenda>findBySemana(String Semana);


}
