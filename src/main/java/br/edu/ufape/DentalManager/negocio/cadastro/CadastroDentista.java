package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.DentalManager.dado.ColecaoDentista;
import br.edu.ufape.DentalManager.negocio.basica.Dentista;

@Service
public class CadastroDentista implements InterfaceCadastroDentista{

	@Autowired
	private ColecaoDentista colecaodentista;

	@Override
	public List<Dentista> procurarDentistaNome(String nome) {
		
		 return colecaodentista.findByNomeContaining(nome);
	}

	@Override
	public Dentista procurarDentistaId(long id) {
		
		return colecaodentista.findById(id).orElse(null);
	}

	@Override
	public List<Dentista> listarDentista() {
		
		return colecaodentista.findAll();
	}

	@Override
	public void deletarDentistaId(Long id) {
		
		colecaodentista.deleteById(id);
	}

	@Override
	public void salvarDentista(Dentista dentista) {
		
		colecaodentista.save(dentista);
	}

	@Override
	public void deletarDentista(Dentista dentista) {
		
		colecaodentista.delete(dentista);
	}


}
