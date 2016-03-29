package mx.com.practica.app;

import java.util.Random;

import mx.com.practica.zoologico.Animal;
import mx.com.practica.zoologico.Conejo;
import mx.com.practica.zoologico.Gato;
import mx.com.practica.zoologico.Perro;
import mx.com.practica.zoologico.Zoologico;


public class App {

	public static void main(String[] args) {
		App applicacion = new App();
		applicacion.inicia();
	}

	private void inicia() {
		Zoologico zoo = new Zoologico();
		for (Animal animal : zoo.getZoologico()) {
			animal=generateAnimals();
			
		}
	}

	private Animal generateAnimals() {

		Animal animal=null;
		Random rand = new Random();
		int n = rand.nextInt(3) + 1;
		
		switch (n) {
		case 1:
			animal=new Perro();
			break;
		case 2:
			animal=new Gato();
			break;
		case 3:
			animal=new Conejo();
			break;
		}
			
		return animal;
	}
}
