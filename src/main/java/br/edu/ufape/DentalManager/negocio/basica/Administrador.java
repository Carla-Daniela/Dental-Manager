package br.edu.ufape.DentalManager.negocio.basica;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Administrador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	@OneToMany
	private List<Funcionario>funcionarios;
	
	public Administrador() {}
	
	public Administrador(long id, String nome, Endereco endereco, List<Funcionario> funcionarios) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.funcionarios = funcionarios;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(endereco, funcionarios, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrador other = (Administrador) obj;
		return Objects.equals(endereco, other.endereco) && Objects.equals(funcionarios, other.funcionarios)
				&& id == other.id && Objects.equals(nome, other.nome);
	}

	
	
}

