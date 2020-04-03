package model;

import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {

	private PApplet app;
	private String[] infoPeli;
	private LinkedList<Contenido> listPelis;
	PImage Break, dark, mind, ozark, star, strange,irish;

	public Logic(PApplet app) {
		this.app = app;
		listPelis = new LinkedList<Contenido>();
		cargaInfo();
		crearInfo();
	}
	
	public void cargaInfo() {
		infoPeli = app.loadStrings("./carpeta/netflix.txt");
		Break = app.loadImage("./carpeta/img/breakingbad.jpg");
		dark = app.loadImage("./carpeta/img/dark.jpg");
		mind = app.loadImage("./carpeta/img/mindhunter.jpg");
		ozark = app.loadImage("./carpeta/img/ozark.jpg");
		star = app.loadImage("./carpeta/img/startrek.jpg");
		strange = app.loadImage("./carpeta/img/strangerthings.jpg");
		irish = app.loadImage("./carpeta/img/theirishman.jpg");
		//System.out.println(infoPeli[0]);
	}
	public void crearInfo() {
		for (int i = 0; i < infoPeli.length; i++) {
			String[] infoP = infoPeli[i].split(",");
			String nombre1 = infoP[0];
			String tipo1 = infoP[3];
			int ano1 = Integer.parseInt(infoP[1]);
			int rating1 = Integer.parseInt(infoP[2]);
			
			if(infoP[3].contentEquals("serie")) {
				listPelis.add(new Serie(nombre1,ano1,rating1,tipo1,app));
			}else {
				listPelis.add(new Pelicula(nombre1,ano1,rating1,tipo1,app));
			}
		
		}
		
	}
	
	public void draw() {
		
		app.text("Peliculas",50,200);
		app.text("Series",50,400);

		for (int i = 0; i < listPelis.size(); i++) {
			listPelis.get(i).draw();
		}
	}
}