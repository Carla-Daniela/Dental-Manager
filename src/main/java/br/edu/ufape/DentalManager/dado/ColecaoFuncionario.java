package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufape.DentalManager.negocio.basica.Funcionario;




public interface ColecaoFuncionario extends  JpaRepository<Funcionario, Long> {
		
	public List<Funcionario> findByNomeContaining(String nome);
}
