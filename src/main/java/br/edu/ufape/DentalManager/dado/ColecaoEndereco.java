package br.edu.ufape.DentalManager.dado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufape.DentalManager.negocio.basica.Endereco;

public interface ColecaoEndereco extends JpaRepository<Endereco, Long> {

	public List<Endereco> findByCep(String cep);
}
