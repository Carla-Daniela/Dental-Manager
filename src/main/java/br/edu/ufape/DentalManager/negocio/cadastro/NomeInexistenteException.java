package br.edu.ufape.DentalManager.negocio.cadastro;

public class NomeInexistenteException extends Exception {
	public NomeInexistenteException() {
		super("Nome não encontrado no sistema!");
	}
}
