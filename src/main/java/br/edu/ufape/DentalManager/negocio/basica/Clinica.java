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
public class Clinica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	private String cnpj;
	@OneToOne(cascade = CascadeType.ALL)
	private Administrador admin;
	@OneToMany
	private List<Funcionario> funcionarios;
	
	public Clinica() {
	}

	

	public Clinica(long id, String nome, Endereco endereco, String cnpj, Administrador admin,
			List<Funcionario> funcionarios) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.admin = admin;
		this.funcionarios = funcionarios;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

	public Administrador getAdmin() {
		return admin;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}



	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}



	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}



	@Override
	public int hashCode() {
		return Objects.hash(admin, cnpj, endereco, funcionarios, id, nome);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clinica other = (Clinica) obj;
		return Objects.equals(admin, other.admin) && Objects.equals(cnpj, other.cnpj)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(funcionarios, other.funcionarios)
				&& id == other.id && Objects.equals(nome, other.nome);
	}

	

	

	
	
}
