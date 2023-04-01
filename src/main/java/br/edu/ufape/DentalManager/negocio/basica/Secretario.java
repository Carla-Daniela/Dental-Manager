package br.edu.ufape.DentalManager.negocio.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idFunci")
public class Secretario extends Funcionario{
	
	
	public  Secretario(){
		super();
	}

	
	
	public void agendar() {}
	public void confirmarAgendamento() {}
	
	
	
	
}
