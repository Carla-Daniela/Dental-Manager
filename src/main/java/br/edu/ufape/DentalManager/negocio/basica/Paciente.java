package br.edu.ufape.DentalManager.negocio.basica;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private Date nascimento;
	private boolean sexo;
	private String alergia;
	private String tipoSanguineo;
	private String deficiencia;
	private String cpf;
	
	public Paciente() {
	}



	public Paciente(long id, String nome, Date nascimento, boolean sexo, String alergia, String tipoSanguineo,
			String deficiencia) {
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.alergia = alergia;
		this.tipoSanguineo = tipoSanguineo;
		this.deficiencia = deficiencia;
		this.cpf = cpf;
	}



	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getDeficiencia() {
		return deficiencia;
	}

	public void setDeficiencia(String deficiencia) {
		this.deficiencia = deficiencia;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	@Override
	public int hashCode() {
		return Objects.hash(alergia, cpf, deficiencia, id, nascimento, nome, sexo, tipoSanguineo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(alergia, other.alergia) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(deficiencia, other.deficiencia) && id == other.id
				&& Objects.equals(nascimento, other.nascimento) && Objects.equals(nome, other.nome)
				&& sexo == other.sexo && Objects.equals(tipoSanguineo, other.tipoSanguineo);
	}

	
}
