package mx.com.practica.app;

import java.util.Random;

import mx.com.practica.animales.Animal;
import mx.com.practica.animales.Gallina;
import mx.com.practica.animales.Lagartija;
import mx.com.practica.animales.Perro;
import mx.com.practica.animales.Rana;
import mx.com.practica.animales.Tiburon;
import mx.com.practica.zoologico.Zoologico;


public class App {

	public static void main(String[] args) {
		App applicacion = new App();
		applicacion.inicia();
	}

	private void inicia() {
		Zoologico zoo = new Zoologico();
		for (Animal animal : zoo.getZoologico()) {
			animal=generadorDeAnimales();
		}
	}

	private Animal generadorDeAnimales() {

		Animal animal=null;
		Random rand = new Random();
		int n = rand.nextInt(4) + 1;
		int s=rand.nextInt(1);
		
		switch (n) {
		case 1:
			animal=new Perro();
			break;
		case 2:
			animal=new Tiburon();
			break;
		case 3:
			animal=new Gallina();
			break;
		case 4:
			animal=new Lagartija();
			break;
		case 5:
			animal=new Rana();
			break;
		}
		
			animal.setSexo(s);
		return animal;
	}
}
