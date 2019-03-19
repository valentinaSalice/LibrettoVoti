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
	
	/*/**
	 * Aggiunge un nuovo voto al libretto
	 * @param v {@link Voto} da aggiungere
	 */
	//public void add(Voto v) { //.add in generale restituisce true se la collezione è cambiata altrimenti restituisce false, cambio il metodo da void in boolean
	
	public boolean add(Voto v) {
		if(!this.esisteGiaVoto(v) && !this.votoConflitto(v)) {
			
			voti.add(v);
			return true;
		}
			
		else
			return false;
		
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
	
	//Il metodo seguente non avrebbe bisogno del for perché esiste già una funzione della libreria che consente di cercare un elemento nella lista (indexOf) che ci restituisce la posizione dell'oggetto 
	public Voto cercaEsame(String nomeEsame) {
		
		Voto voto= new Voto(0,nomeEsame, null); //mi serve solo come criterio di ricerca che mi permette di valutare se c'è un oggetto con lo stesso nome esame 
		/*for(Voto v:this.voti) {
			
			if(v.getCorso().equals(nomeEsame)) { //compareTo si può usare solo per quegli oggetti per cui si può definire un ordinamento naturale degli oggetti
				
				return v;
			}
			
		}*/
		
		int posizione=this.voti.indexOf(voto);
		if(posizione==-1)
		    return null;
		else
			return this.voti.get(posizione);
	}
	
	/**
	 * Dato un {@link Voto}, determina se esiste già un voto con uguale corso e uguale punteggio
	 * @param v
	 * @return {@code true} se ha trovato un corso e punteggio uguali, {@code false} se non ha trovato il corso, oppure l'ha trovato con voto diverso
	 */
	
	public boolean esisteGiaVoto(Voto v) { //anche in questo caso si poteva utilizzare indexOf
		
		int posizione=this.voti.indexOf(v);
		
		/*Voto trovato=this.cercaEsame(v.getCorso());
		
		if(trovato==null)
			return false;
		if(trovato.getPunti()==v.getPunti()) {
			
			return true;
		}
		else
			return false;*/
		
		if(posizione==-1)
			return false;
		else 
			
			return (v.getPunti()==this.voti.get(posizione).getPunti());
			
		
		
		
		
		
	}
	/**
	 * Mi dice se il {@link Voto} {@code v} è in conflitto con uno dei voti esistenti
	 * Se il voto non esiste, non c'è conflitto. Se esiste e ha un punteggio diverso, c'è conflitto
	 * @param v
	 * @return
	 */
	
	public boolean votoConflitto(Voto v) {
		
		int posizione=this.voti.indexOf(v);
		
		if(posizione==-1)
			return false;
		else 
			
			return (v.getPunti()==this.voti.get(posizione).getPunti());
	}
	
	public String toString() {
		return this.voti.toString();
	}

}
