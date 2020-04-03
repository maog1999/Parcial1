package model;

import processing.core.PApplet;

public class Pelicula extends Contenido {

	private PApplet app;
	
	public Pelicula(String nombre, int ano, int rating, String tipo, PApplet app) {
		super(nombre, ano, rating, tipo, app);
		this.app = app;
	}

	public void draw() {
		app.fill(255);
		app.text(this.getNombre(),getPosX(),getPosY());
		app.text(this.getAno(),getPosX(),getPosY());
		app.text(this.getRating(),getPosX(),getPosY());
	}

}
