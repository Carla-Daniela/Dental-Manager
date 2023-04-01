package br.edu.ufape.DentalManager.negocio.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idFunci")
public class Dentista extends Funcionario {

	
	private int CRO;
	
	
	public Dentista(){}
	
	public Dentista(int CRO) {
		super();
		this.CRO = CRO;
	}

	
	
	public int getCRO() {
		return CRO;
	}

	public void setCRO(int cRO) {
		CRO = cRO;
	}
	
	public void criarAgenda() {}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + CRO;
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
		Dentista other = (Dentista) obj;
		if (CRO != other.CRO)
			return false;
		return true;
	}
	
	
	
	
}
