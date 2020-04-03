package model;

import processing.core.PApplet;

public class Serie extends Contenido {

	private PApplet app;

	public Serie(String nombre, int ano, int rating, String tipo, PApplet app) {
		super(nombre, ano, rating, tipo, app);

		this.app = app;

	}

	public void draw(int posX, int posY) {
		app.fill(255);
		app.textSize(15);
		app.text(getNombre() + " " + getAno() + " " + getRating() + "% " + getTipo(), posX, posY);

	}

}
