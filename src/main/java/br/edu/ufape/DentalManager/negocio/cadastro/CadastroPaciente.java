package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.DentalManager.dado.ColecaoPaciente;
import br.edu.ufape.DentalManager.negocio.basica.Paciente;


@Service
public class CadastroPaciente implements InterfaceCadastroPaciente{

	@Autowired
	private ColecaoPaciente colecaoPaciente;

	@Override
	public List<Paciente> procurarPacienteNome(String nome) {
		try {
			NomeValidator excecaoNome = new NomeValidator();
			excecaoNome.encontrarNome(colecaoPaciente.findAll(),nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	public void salvarPaciente(Paciente entity) {
		
		CPFValidator ValidarCPF = new CPFValidator();
		try {
			if (ValidarCPF.validateCPF(entity.getCpf()) == true)
			
				colecaoPaciente.save(entity);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletarPaciente(Paciente paciente) {
		colecaoPaciente.delete(paciente);
		
	}
	
}
