package mx.com.practica.animales;

import mx.com.practica.reino.Mamifero;
import mx.com.practica.reino.Oviparo;
import mx.com.practica.zoologico.alimento.Alimento;

public class Perro extends Animal implements Mamifero,Oviparo{
	
	private String nombre;
	
	
	
	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Perro(){	
		System.out.println("Perro creado");
	}


	@Override
	public void dormir() {
		// TODO Auto-generated method stub	
	}


	@Override
	public Animal procrea(Animal animal) {
		Animal cachorro = null;
		if (this.getSexo() == animal.getSexo()) {
			System.out.println("Se reproduce animal");
			cachorro = new Perro();
		} else {
			System.err.println("No es posible la reproduccion entre animales del mismo sexo");
		}
		return cachorro;

	}
	
	@Override
	public void alimentarse(double porcion,Alimento alimento) {
		
	}

}
