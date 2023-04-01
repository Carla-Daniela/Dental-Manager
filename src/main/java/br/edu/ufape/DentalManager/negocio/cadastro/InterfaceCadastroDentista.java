package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Dentista;

public interface InterfaceCadastroDentista {
	
	List<Dentista> procurarDentistaNome(String nome);

	Dentista procurarDentistaId(long id);

	List<Dentista> listarDentista();

	void deletarDentistaId(Long id);

	void salvarDentista(Dentista dentista);

	void deletarDentista(Dentista dentista);



}
