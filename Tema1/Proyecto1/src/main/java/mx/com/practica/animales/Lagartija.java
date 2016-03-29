package mx.com.practica.animales;

import mx.com.practica.reino.Reptil;

public class Lagartija extends Animal implements Reptil {

	public Lagartija() {
		super();
		System.out.println("Lagartija creada");
	}

	@Override
	public void enfria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calienta() {
		// TODO Auto-generated method stub

	}

	@Override
	Animal procrea(Animal animal) {
		Animal cachorro = null;
		if (this.getSexo() == animal.getSexo()) {
			System.out.println("Se reproduce animal");
			cachorro = new Lagartija();
		} else {
			System.err.println("No es posible la reproduccion entre animales del mismo sexo");
		}
		return cachorro;

	}

}
