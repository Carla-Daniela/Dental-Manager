package br.edu.ufape.DentalManager.negocio.basica;

public class CPFInvalidoException extends Exception {
	public CPFInvalidoException() {
		super("CPF invalido!");
	}
}