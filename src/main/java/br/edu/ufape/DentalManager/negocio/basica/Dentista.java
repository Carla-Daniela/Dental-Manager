package br.edu.ufape.DentalManager.negocio.basica;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idFunci")
public class Dentista extends Funcionario {

	
	private int CRO;
	@OneToMany
	private List<Agenda>agenda;
	public Dentista(){}
	

	public Dentista(int cRO, List<Agenda> agenda) {
		super();
		CRO = cRO;
		this.agenda = agenda;
	}


	public int getCRO() {
		return CRO;
	}

	public void setCRO(int cRO) throws CROException {
	if(cRO!=0)
		CRO = cRO;
	throw new CROException();	
		
	}
	

	public List<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Agenda> agenda) {
		this.agenda = agenda;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(CRO, agenda);
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
		return CRO == other.CRO && Objects.equals(agenda, other.agenda);
	}




	
	
	
	
	
}
