package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {

	private PApplet app;
	private String[] infoPeli;
	private LinkedList<Contenido> listPelis;
	PImage Break, dark, mind, ozark, star, strange, irish, fondo;
	private ContenidoParcialNombre contenidoParcialNombre;
	private ContenidoParcialAno contenidoParcialAno;
	private ContenidoParcialTipo contenidoParcialTipo;

	public Logic(PApplet app) {
		this.app = app;
		listPelis = new LinkedList<Contenido>();
		contenidoParcialNombre = new ContenidoParcialNombre();
		contenidoParcialAno = new ContenidoParcialAno();
		contenidoParcialTipo = new ContenidoParcialTipo();

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
		fondo = app.loadImage("./carpeta/img/fondo.jpg");
		// System.out.println(infoPeli[0]);
	}

	public void crearInfo() {
		for (int i = 0; i < infoPeli.length; i++) {
			String[] infoP = infoPeli[i].split(",");
			String nombre1 = infoP[0];
			String tipo1 = infoP[3];
			int ano1 = Integer.parseInt(infoP[1]);
			int rating1 = Integer.parseInt(infoP[2]);

			if (infoP[3].contentEquals("serie")) {
				listPelis.add(new Serie(nombre1, ano1, rating1, tipo1, app));
			} else {
				listPelis.add(new Pelicula(nombre1, ano1, rating1, tipo1, app));
			}

		}

	}

	public void draw() {
		app.image(fondo, 0, 0);

		for (int i = 0; i < listPelis.size(); i++) {
			int posX = 20;
			int posY = 82 * (i + 1);
			listPelis.get(i).draw(posX, posY);
		}
	}

	public void ordenar() {
		if (app.mouseX > 74 && app.mouseX < 162 && app.mouseY > 557 && app.mouseY < 587) {//nombre
			Collections.sort(listPelis,contenidoParcialNombre);
		}
		if (app.mouseX > 196 && app.mouseX < 282 && app.mouseY > 557 && app.mouseY < 587) {//ano
			Collections.sort(listPelis,contenidoParcialAno);
		}
		if (app.mouseX > 317 && app.mouseX < 403 && app.mouseY > 557 && app.mouseY < 587) {//rting
			Collections.sort(listPelis);
		}
		if (app.mouseX > 438 && app.mouseX < 524 && app.mouseY > 557 && app.mouseY < 587) {//tipo
			Collections.sort(listPelis,contenidoParcialTipo);
		}
	}
}