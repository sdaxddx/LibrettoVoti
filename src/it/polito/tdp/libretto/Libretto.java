package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	List<Voto> voti;

	public Libretto() {
		this.voti = new ArrayList<>();
	}
	
	public void add(Voto v) {
		voti.add(v);
	}
	
	public void stampa() {
		System.out.println("Ci sono " + voti.size() + " voti\n"); 
		for(Voto v : voti) {
			System.out.println(v);
		}
	}
	
	public void stampaMaggioreDi(int voto) {
		for(Voto v : voti) {
			if(v.getVoto()> voto) 
				System.out.println(v);
		}
	}
	
}
