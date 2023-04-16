package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ufape.DentalManager.dado.ColecaoPaciente;
import br.edu.ufape.DentalManager.negocio.basica.Paciente;

public class CadastroPaciente implements InterfaceCadastroPaciente{

	@Autowired
	private ColecaoPaciente colecaoPaciente;

	@Override
	public List<Paciente> procurarPacienteNome(String nome) {
		return colecaoPaciente.findByNome(nome);
	}

	@Override
	public Paciente procurarPacienteId(long id) {
		return colecaoPaciente.findById(id).orElse(null);
	}

	@Override
	public List<Paciente> listarPaciente() {
		return colecaoPaciente.findAll();
	}

	@Override
	public void deletarPaciente(long id) {
		colecaoPaciente.deleteById(id);
		
	}

	@Override
	public Paciente salvarPaciente(Paciente entity) {
		return colecaoPaciente.save(entity);
	}

	@Override
	public void deletarPaciente(Paciente paciente) {
		colecaoPaciente.delete(paciente);
		
	}
	
}
