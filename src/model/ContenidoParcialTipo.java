package model;

import java.util.Comparator;

public class ContenidoParcialTipo implements Comparator <Contenido> {

	public ContenidoParcialTipo() {
		// TODO Auto-generated constructor stub
	}

	public int compare(Contenido o1, Contenido o2) {
		return o1.getTipo().compareTo(o2.getTipo());
	}

}
