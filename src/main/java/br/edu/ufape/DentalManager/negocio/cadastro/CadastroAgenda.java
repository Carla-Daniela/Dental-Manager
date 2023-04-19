package br.edu.ufape.DentalManager.negocio.cadastro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.DentalManager.dado.ColecaoAgenda;
import br.edu.ufape.DentalManager.negocio.basica.Agenda;

@Service
public class CadastroAgenda implements InterfaceCadastroAgenda{
	
	
	@Autowired
	private ColecaoAgenda colecaoagenda;
	
	@Override
	public List<Agenda> procurarAgendaSemana(String semana) {
		return colecaoagenda.findBySemana(semana);
	}

	@Override
	public Agenda procuraAgendaId(long id) {
		return colecaoagenda.findById(id).orElse(null);
	}

	@Override
	public List<Agenda> listarAgenda() {
		return colecaoagenda.findAll();
	}

	@Override
	public void deletarAgendaId(long id) {
		colecaoagenda.deleteById(id);
		
	}

	@Override
	public void salvarAgenda(Agenda agenda) {
		colecaoagenda.delete(agenda);
		
	}

	@Override
	public void deletarAgenda(Agenda agenda) {
		colecaoagenda.save(agenda);
		
	}
	
	@Override
	public List<Double> retornarHorario(String dia){
		List <Agenda> retorno = listarAgenda();
		List<Double> aux = new ArrayList<Double>();
		double aux1;
		for(Agenda agenda : retorno) {
		
			if(agenda.getDia()== dia) {
				aux1 = agenda.getHorario();
				aux.add(aux1);
			}	
		}
		return aux;
	}

}
