package mx.com.practica.animales;

import mx.com.practica.reino.Anfibio;

public class Rana extends Animal implements Anfibio {
	
	

	public Rana() {
		super();
		System.out.println("Rana creada");
	}

	@Override
	public void nada() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camina() {
		// TODO Auto-generated method stub

	}

	@Override
	Animal procrea(Animal animal) {
		Animal cachorro = null;
		if (this.getSexo() == animal.getSexo()) {
			System.out.println("Se reproduce animal");
			cachorro = new Rana();
		} else {
			System.err.println("No es posible la reproduccion entre animales del mismo sexo");
		}
		return cachorro;

	}



}
