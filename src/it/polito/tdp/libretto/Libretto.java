package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto>voti; //conviene mantere le interfacce più generali possibili e poi specificare nel costruttore
	
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
	 * @return lista di {@link Voto} aventi quel punteggio (eventualmente vuota)
	 */
	
	
	public List<Voto> cercaVoti(int punti){
		List<Voto>result=new ArrayList<Voto>(); //L'arrayList tutte le volte che faccio new riempe una cella di memoria
		
		for(Voto v:this.voti) {
			
			if(v.getPunti()==punti)
				result.add(v);
		}
		
		return result;
		
		
	}
	
	/**
	 * Ricerca un voto {@link Voto} relativo al corso per cui è specificato il nome
	 * 
	 * @param nomeEsame nome del corso da ricercare
	 * @return il {@link Voto} corrispondente, oppure {@code null} se non c'è
	 */
	
	public Voto cercaEsame(String nomeEsame) {
		for(Voto v:this.voti) {
			
			if(v.getCorso().equals(nomeEsame)) { //compareTo si può usare solo per quegli oggetti per cui si può definire un ordinamento naturale degli oggetti
				
				return v;
			}
			
		}
		
		return null;
	}
	
	/**
	 * Dato un {@link Voto}, determina se esiste già un voto con uguale corso e uguale punteggio
	 * @param v
	 * @return {@code true} se ha trovato un corso e punteggio uguali, {@code false} se non ha trovato il corso, oppure l'ha trovato con voto diverso
	 */
	
	public boolean esisteGiaVoto(Voto v) {
		
		Voto trovato=this.cercaEsame(v.getCorso());
		
		if(trovato==null)
			return false;
		if(trovato.getPunti()==v.getPunti()) {
			
			return true;
		}
		else
			return false;
		
		
		
		
	}

}
