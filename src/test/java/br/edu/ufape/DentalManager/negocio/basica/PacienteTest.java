package br.edu.ufape.DentalManager.negocio.basica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.edu.ufape.DentalManager.negocio.cadastro.CPFInvalidoException;
import com.github.javafaker.Faker;

class PacienteTest {

	Faker faker = new Faker();
	String cpf = faker.number().digits(11);
	String cpfSemErro = "54647142949";
	
	@Test
	void testSetCpf() throws ParseException {
		Endereco e = new Endereco(0,"sao pedro",151,"magano","garanhuns","55290000","casa");
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date data = formato.parse("23/11/2015");
		Paciente paciente = new Paciente(0,"Flavia",data,false,"nenhuma","A+","nenhuma",cpfSemErro,e,null);
		
		assertEquals(paciente.getCpf(),"54647142949");
	}

}
