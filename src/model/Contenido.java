package model;

import processing.core.PApplet;

public class Contenido implements Comparable<Contenido>{

	private PApplet app;
	private String nombre, tipo;
	private int ano, rating, posX, posY;


	public Contenido(String nombre, int ano, int rating, String tipo, PApplet app ) {
		this.nombre = nombre;
		this.ano = ano;
		this.rating = rating;
		this.tipo = tipo;
		this.app = app;


	}

	public void draw(int posX, int posY) {

	}

	
	public int getPosX() {
		return posX;
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(Contenido o) {
		return o.getRating() - this.rating ;
	}
}
