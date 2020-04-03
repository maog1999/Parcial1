package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class MainView extends PApplet {

	private ControllerMain controllerMain;
	
	public static void main(String[] args) {
		PApplet.main("view.MainView");
	}

	public void settings() {
		size(600,600);
	}

	public void setup() {
		controllerMain = new ControllerMain(this);
	}

	public void draw() {
		background(0);
		controllerMain.draw();
	}

}
