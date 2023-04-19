package br.edu.ufape.DentalManager.negocio.basica;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Agenda{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String dia;
	private String semana;
	private String mes;
	private double horario;
	@OneToMany
	private List<Agendamento> agendamentos;
	
	public Agenda () {
		
	}
	public Agenda(long id, String dia, String semana, String mes, double horario , List<Agendamento> agendamentos) {
		super();
		this.id = id;
		this.dia = dia;
		this.semana = semana;
		this.mes = mes;
		this.horario = horario;
		this.agendamentos = agendamentos;
	}
	
	public long getId() {
		return id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getSemana() {
		return semana;
	}

	public void setSemana(String semana) {
		this.semana = semana;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public double getHorario() {
		return horario;
	}

	public void setHorario(double horario) {
		this.horario = horario;
	}
	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}
	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(agendamentos, dia, horario, id, mes, semana);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(agendamentos, other.agendamentos) && Objects.equals(dia, other.dia)
				&& Objects.equals(horario, other.horario) && id == other.id && Objects.equals(mes, other.mes)
				&& Objects.equals(semana, other.semana);
	}

	
	
	
}

