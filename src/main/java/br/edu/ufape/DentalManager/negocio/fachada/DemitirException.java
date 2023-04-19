package br.edu.ufape.DentalManager.negocio.fachada;

public class DemitirException extends Exception {

	public DemitirException () {
		super("Funcionario não pôde ser demitido pois ele não existe");
		
	}
}
