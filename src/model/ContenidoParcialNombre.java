package model;

import java.util.Comparator;

public class ContenidoParcialNombre implements Comparator<Contenido>{

	public ContenidoParcialNombre() {
	}

	
	public int compare(Contenido o1, Contenido o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
