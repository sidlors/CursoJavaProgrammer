package mx.com.practica.animales;

import mx.com.practica.reino.Pez;

public class Tiburon extends Animal implements Pez {
	
	

	public Tiburon() {
		super();
		System.out.println("Tiburon creado");
	}

	@Override
	public void nada() {
		// TODO Auto-generated method stub

	}

	@Override
	Animal procrea(Animal animal) {
		Animal cachorro = null;
		if (this.getSexo() == animal.getSexo()) {
			System.out.println("Se reproduce animal");
			cachorro = new Tiburon();
		} else {
			System.err.println("No es posible la reproduccion entre animales del mismo sexo");
		}
		return cachorro;

	}


}
