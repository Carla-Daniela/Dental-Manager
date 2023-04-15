package br.edu.ufape.DentalManager.negocio.basica;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomePaciente;
	private String horario;
	private Date data;
	private String nomeMedico;
	private String procedimento;
	
	public Agendamento(String nomePaciente, String horario, Date data, String nomeMedico, String procedimento) {

		this.nomePaciente = nomePaciente;
		this.horario = horario;
		this.data = data;
		this.nomeMedico = nomeMedico;
		this.procedimento = procedimento;
	}

	public long getId() {
		return id;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data, horario, id, nomeMedico, nomePaciente, procedimento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		return Objects.equals(data, other.data) && Objects.equals(horario, other.horario) && id == other.id
				&& Objects.equals(nomeMedico, other.nomeMedico) && Objects.equals(nomePaciente, other.nomePaciente)
				&& Objects.equals(procedimento, other.procedimento);
	}
	
}
