package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	
	private int voto;
	private String corso;
	private LocalDate data; //Date o Calendar permettono di gestire le date, creavano dei problemi. Da Java 7 è stato introdotto LocalDate
	
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.voto = voto;
		this.corso = corso;
		this.data = data;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
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
		return String.format("Voto [voto=%s, corso=%s, data=%s]", voto, corso, data);
	}
	
	
	
	
	

	
}
