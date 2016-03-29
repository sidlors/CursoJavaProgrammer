package mx.com.practica.zoologico;

import mx.com.practica.animales.Animal;

public class Zoologico {
	
	private Animal[] zoologico;
	
	public Zoologico(){
		zoologico=new Animal[20];
	}

	public Animal[] getZoologico() {
		return zoologico;
	}

	public void setZoologico(Animal[] zoologico) {
		this.zoologico = zoologico;
	}
	
	public void temporadaDeApareamiento(){
		//TODO
	}
	
	
	public void temporadaDeExterminio(){
		//TODO
		
	}
	
	public void temporadaDeAlimentacion(){
		//TODO
	}

}
