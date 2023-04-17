package br.edu.ufape.DentalManager.negocio.cadastro;

public class FuncionarioInexistenteException extends Exception{

	public FuncionarioInexistenteException() {
		super("Este funcionário não existe!");
	}
}
