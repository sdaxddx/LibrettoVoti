package it.polito.tdp.libretto;

import java.time.LocalDate;

// POJO (plain old java object)

public class Voto {
	private String esame;
	private int voto;
	// private LocalDate data;
	
	/**
	 * @param esame
	 * @param voto
	 * @param data
	 */
	public Voto(String esame, int voto) {
		this.esame = esame;
		this.voto = voto;
		// this.data = data;
	}

	/**
	 * @return the esame
	 */
	public String getEsame() {
		return esame;
	}

	/**
	 * @param esame the esame to set
	 */
	public void setEsame(String esame) {
		this.esame = esame;
	}

	/**
	 * @return the voto
	 */
	public int getVoto() {
		return voto;
	}

	/**
	 * @param voto the voto to set
	 */
	public void setVoto(int voto) {
		this.voto = voto;
	}

	/**
	 * @return the name and the score
	 */
	public String toString() {
		return getEsame() + " " + getVoto() + "\n";
	}
	
	
	
}
