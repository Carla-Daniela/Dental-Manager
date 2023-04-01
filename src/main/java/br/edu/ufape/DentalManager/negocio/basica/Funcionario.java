package br.edu.ufape.DentalManager.negocio.basica;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFunci;
	
	private String nome;
	private Date admissao;
	private String cargo;
	
	
	public Funcionario() {}
	
	public Funcionario( String nome, Date admissao, String cargo) {
		this.nome = nome;
		this.admissao = admissao;
		this.cargo = cargo;
	}

	
	public long getId() {
		return idFunci;
	}

	public void setId(int id) {
		this.idFunci = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admissao == null) ? 0 : admissao.hashCode());
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + idFunci;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (admissao == null) {
			if (other.admissao != null)
				return false;
		} else if (!admissao.equals(other.admissao))
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (idFunci != other.idFunci)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	

}
