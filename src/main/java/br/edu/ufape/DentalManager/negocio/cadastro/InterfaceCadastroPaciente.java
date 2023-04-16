package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.List;

import br.edu.ufape.DentalManager.negocio.basica.Paciente;

public interface InterfaceCadastroPaciente {

	List<Paciente> procurarPacienteNome (String nome);
	
	Paciente procurarPacienteId(long id);
	
	List<Paciente> listarPaciente();
	
	void deletarPaciente (long id);
	
	Paciente salvarPaciente (Paciente entity);
	
	void deletarPaciente (Paciente paciente);
}
