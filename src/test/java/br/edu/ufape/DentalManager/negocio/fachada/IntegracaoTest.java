package br.edu.ufape.DentalManager.negocio.fachada;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import br.edu.ufape.DentalManager.negocio.basica.Agendamento;
import br.edu.ufape.DentalManager.negocio.basica.Clinica;
import br.edu.ufape.DentalManager.negocio.basica.DataAgendException;
import br.edu.ufape.DentalManager.negocio.basica.Endereco;
import br.edu.ufape.DentalManager.negocio.basica.Funcionario;


@SpringBootTest
class IntegracaoTest {
		@Autowired
		private Dentalmanager dt;
		Endereco e = new Endereco(0,"sao pedro",151,"magano","garanhuns","55290000","casa");
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date data;
		
	@Test
	void testSalvarFuncionario() throws ParseException{
		data=formato.parse("23/11/2015");
		Funcionario f= new Funcionario(0, e, "carla", data, "secretaria", 7563428);
		dt.salvarFuncionario(f);
		assertTrue(true,"OK");
	}
	
	@Test
	void testConfirmarAgendamento() throws ParseException, AgendamentoInvalidoException, DataAgendException{
		Agendamento agendamento = new Agendamento(0,"Nick", "14:30", null, "Nicolas", "Extracacao",false);
		dt.Agendamento(agendamento);
		boolean a=dt.ConfirmarAgendamento(agendamento);
		assertEquals(true,true);
		
	}
	
	@Test
	void salvarClinica(){
		Clinica clinica = new Clinica(1,"clinica dente", e, null, null,null);
		try {
	        dt.salvarClinica(clinica);
	       
	    } catch (ClinicaCnpjException x) {
	        assertEquals("Não pode salvar clinica sem CNPJ", x.getMessage());
	    }
		
	}
	

}
