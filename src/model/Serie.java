package model;

import processing.core.PApplet;

public class Serie extends Contenido {

	private PApplet app;
	private int posX, posY;
	public Serie(String nombre, int ano, int rating, String tipo, PApplet app) {
		super(nombre, ano, rating, tipo, app);
		
		this.app = app;
		this.posX = 250;
		this.posY = 250;
	}

	public void draw() {
		app.fill(255);
		app.text(this.getNombre(),getPosX(),getPosY());
		app.text(this.getAno(),getPosX(),getPosY());
		app.text(this.getRating(),getPosX(),getPosY());

	}

}
