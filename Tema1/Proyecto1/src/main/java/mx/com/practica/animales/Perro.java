package mx.com.practica.animales;

import mx.com.practica.reino.Mamifero;

public class Perro extends Animal implements Mamifero{
	
	
	public Perro(){	
		System.out.println("Perro creado");
	}


	@Override
	public void dormir() {
		// TODO Auto-generated method stub	
	}


	@Override
	Animal procrea(Animal animal) {
		Animal cachorro = null;
		if (this.getSexo() == animal.getSexo()) {
			System.out.println("Se reproduce animal");
			cachorro = new Perro();
		} else {
			System.err.println("No es posible la reproduccion entre animales del mismo sexo");
		}
		return cachorro;

	}

}
