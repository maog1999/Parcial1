package model;

import java.util.Comparator;

public class ContenidoParcialAno implements Comparator<Contenido>{

	public ContenidoParcialAno() {
	}

	
	public int compare(Contenido o1, Contenido o2) {
		return o2.getAno() - o1.getAno() ;
	}

}
