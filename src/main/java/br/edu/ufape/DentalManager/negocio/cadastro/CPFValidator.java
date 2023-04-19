package br.edu.ufape.DentalManager.negocio.cadastro;

public class CPFValidator {

	public boolean validateCPF(String cpf) throws Exception {
		boolean valida = false;
		cpf = cpf.replaceAll("[.-]", "");

		// Verifica se o CPF possui 11 dígitos
		if (cpf.length() != 11) {
			throw new CPFInvalidoException();
		}

		// Verifica se todos os dígitos são iguais
		if (cpf.matches("(\\d)\\1{10}")) {
			throw new CPFInvalidoException();
		}

		// Calcula o primeiro dígito verificador
		int soma = 0;
		for (int i = 9; i >= 1; i--) {
			soma += Character.getNumericValue(cpf.charAt(9-i) * i);
		}
		
		//Identifica se o primeiro digito verificador é valido
		if((soma % 11) == Character.getNumericValue(cpf.charAt(10))){
			throw new CPFInvalidoException();
		}
		
		soma = 0;
		
		for (int i = 10; i >= 1; i--) {
			soma += Character.getNumericValue(cpf.charAt(10-i) * i);
		}
		
		if((soma % 11) == Character.getNumericValue(cpf.charAt(10))){
			throw new CPFInvalidoException();
		}
		
		valida = true;
		return valida;
		// CPF é válido
	}

}
