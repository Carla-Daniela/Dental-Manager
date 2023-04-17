package br.edu.ufape.DentalManager.negocio.basica;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idFunci;
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	private String nome;
	private Date admissao;
	private String cargo;
	private long cpf;
	
	public Funcionario() {}

	public Funcionario(long idFunci, Endereco endereco, String nome, Date admissao, String cargo, long cpf) {
		super();
		this.idFunci = idFunci;
		this.endereco = endereco;
		this.nome = nome;
		this.admissao = admissao;
		this.cargo = cargo;
		this.cpf = cpf;
	}

	public long getId() {
		return idFunci;
	}

	public void setId(long id) {
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(admissao, cargo, cpf, endereco, idFunci, nome);
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
		return Objects.equals(admissao, other.admissao) && Objects.equals(cargo, other.cargo) && cpf == other.cpf
				&& Objects.equals(endereco, other.endereco) && idFunci == other.idFunci
				&& Objects.equals(nome, other.nome);
	}
	
	
	

	

}
