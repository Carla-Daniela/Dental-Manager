package br.edu.ufape.DentalManager.negocio.basica;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idFunci")
public class Secretario extends Funcionario{
	
	
	@OneToMany
	private List<Agendamento>agendamentos;
	@OneToMany
	private List<Agenda>agenda;
	
	
	public  Secretario(){
		super();
	}

	
	public Secretario(List<Agendamento> agendamentos, List<Agenda> agenda) {
		super();
		this.agendamentos = agendamentos;
		this.agenda = agenda;
	}


	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}


	public List<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Agenda> agenda) {
		this.agenda = agenda;
	}



	public void agendar() {}
	public void confirmarAgendamento() {}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(agenda, agendamentos);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Secretario other = (Secretario) obj;
		return Objects.equals(agenda, other.agenda) && Objects.equals(agendamentos, other.agendamentos);
	}


	
	
	
	
}
