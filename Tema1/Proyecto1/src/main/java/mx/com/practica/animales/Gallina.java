package mx.com.practica.animales;

import mx.com.practica.reino.Ave;
import mx.com.practica.reino.Herbivoro;


public class Gallina extends Animal implements Ave, Herbivoro{
	
	

	public Gallina() {
		super();
		System.out.println("Gallina creada");
	}

	@Override
	public void vuela() {
		// TODO Auto-generated method stub

	}

	@Override
	Animal procrea(Animal animal) {
		Animal cachorro = null;
		if (this.getSexo() == animal.getSexo()) {
			System.out.println("Se reproduce animal");
			cachorro = new Gallina();
		} else {
			System.err.println("No es posible la reproduccion entre animales del mismo sexo");
		}
		return cachorro;

	}

}
