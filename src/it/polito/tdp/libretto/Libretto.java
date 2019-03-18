package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto>voti; //conviene mantere le interfacce pi� generali possibili e poi specificare nel costruttore
	
	public Libretto() {
		
		this.voti=new ArrayList<Voto>();
	}
	
	public void add(int voto, String corso, LocalDate data) {
		
		
	}
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * @param v {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		
		voti.add(v);
	}
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * @param punti punteggio da ricerca
	 * @return lista di {link Voto} aventi que punteggio (eventualmente vuota)
	 */
	
	
	public List<Voto> cercaVoti(int punti){
		List<Voto>result=new ArrayList<Voto>(); //L'arrayList tutte le volte che faccio new riempe una cella di memoria
		
		for(Voto v:this.voti) {
			
			if(v.getPunti()==punti)
				result.add(v);
		}
		
		return result;
		
		
	}

}
