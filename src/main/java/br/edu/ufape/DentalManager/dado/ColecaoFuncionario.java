package br.edu.ufape.DentalManager.dado;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.DentalManager.negocio.basica.Funcionario;

@Repository
public interface ColecaoFuncionario extends  JpaRepository<Funcionario, Long> {

	List<Funcionario> findByNome(String nome);	
	

	
	
}
