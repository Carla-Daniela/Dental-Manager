package br.edu.ufape.DentalManager.negocio.basica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ClinicaTest {

	@Test
	void testSetCnpj(){
		Endereco e = new Endereco(0,"sao pedro",151,"magano","garanhuns","55290000","casa");
		Clinica clinica = new Clinica(1,"clinica dente", e, "443353434-9", null,null);
		assertEquals(clinica.getCnpj(),"443353434-9");
		
	}

}
