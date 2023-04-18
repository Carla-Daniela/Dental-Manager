package br.edu.ufape.DentalManager.negocio.basica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Date;
import br.edu.ufape.DentalManager.negocio.cadastro.CPFInvalidoException;
import com.github.javafaker.Faker;

class PacienteTest {

	Faker faker = new Faker();
	String cpf = faker.number().digits(11);
	String cpfSemErro = "54647142949";
	
	@Test
	void testSetCpf() {
		System.out.println(cpfSemErro);
		Paciente paciente = new Paciente(0,null,null,false,null,null,null,cpfSemErro,null,null);
	}

}
