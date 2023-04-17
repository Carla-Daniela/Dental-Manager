package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.DentalManager.dado.ColecaoClinica;
import br.edu.ufape.DentalManager.negocio.basica.Clinica;

@Service
public class CadastroClinica implements InterfaceCadastroClinica {

	@Autowired
	private ColecaoClinica colecaoClinica;
	
	@Override
	public List<Clinica> procurarClinicaNome(String nome) {
		return colecaoClinica.findByCnpj(nome);
	}

	@Override
	public Clinica procurarClinicaId(long id) {
		return colecaoClinica.findById(id).orElse(null);
	}

	@Override
	public List<Clinica> listarClinica() {
		return colecaoClinica.findAll();
	}

	@Override
	public void deletarClinicaId(long id) {
		colecaoClinica.deleteById(id);
		
	}

	@Override
	public Clinica salvarClinica(Clinica entity) {
		return colecaoClinica.save(entity);
	}

	@Override
	public void deletarClinica(Clinica clinica) {
		colecaoClinica.delete(clinica);
		
	}

}
