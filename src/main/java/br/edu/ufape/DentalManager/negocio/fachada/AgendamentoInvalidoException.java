package br.edu.ufape.DentalManager.negocio.fachada;

public class AgendamentoInvalidoException extends Exception{
	public AgendamentoInvalidoException() {
		super("Não há agendamento para essa data");
	}
}
