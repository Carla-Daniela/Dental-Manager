package br.edu.ufape.DentalManager.negocio.fachada;

public class ClinicaCnpjException extends Exception{
	public ClinicaCnpjException() {
		super("Não pode salvar clinica sem CNPJ");
	}
}
