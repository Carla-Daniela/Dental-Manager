package br.edu.ufape.DentalManager.negocio.basica;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String dia;
	private String semana;
	private String mes;
	private String horario;
	
	public Agenda(String dia, String semana, String mes, String horario) {

		this.dia = dia;
		this.semana = semana;
		this.mes = mes;
		this.horario = horario;
	}
	public Agenda () {
		
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

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dia, horario, id, mes, semana);
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
		return Objects.equals(dia, other.dia) && Objects.equals(horario, other.horario) && id == other.id
				&& Objects.equals(mes, other.mes) && Objects.equals(semana, other.semana);
	}
	
	
}

