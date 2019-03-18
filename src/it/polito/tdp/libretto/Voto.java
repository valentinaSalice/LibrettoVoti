package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	
	private int punti; //con refactory->rename e option cambio il nome della variabile e ai suoi getter e setter
	private String corso;
	private LocalDate data; //Date o Calendar permettono di gestire le date, creavano dei problemi. Da Java 7 è stato introdotto LocalDate
	
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.punti = voto;
		this.corso = corso;
		this.data = data;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int voto) {
		this.punti = voto;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("Voto [punti=%s, corso=%s, data=%s]", punti, corso, data);
	}
	
	
	
	
	

	
}
