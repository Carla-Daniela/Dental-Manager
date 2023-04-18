package br.edu.ufape.DentalManager.negocio.cadastro;

public class CPFInvalidoException extends Exception {
	public CPFInvalidoException() {
		super("CPF invalido!");
	}
}
