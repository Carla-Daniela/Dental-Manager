package br.edu.ufape.DentalManager.negocio.basica;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class FuncionarioTest {

	@Test
	void testGetNome() throws ParseException {
		Endereco e = new Endereco(0,"sao pedro",151,"magano","garanhuns","55290000","casa");
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date data = formato.parse("23/11/2015");
		Funcionario f= new Funcionario(0, e, "carla", data, "secretaria", 7563428);
		assertEquals(f.getNome(),"carla");
	}

}
