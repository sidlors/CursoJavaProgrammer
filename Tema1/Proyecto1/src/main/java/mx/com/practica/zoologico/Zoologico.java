package mx.com.practica.zoologico;

import java.security.acl.Permission;

import mx.com.practica.animales.Animal;
import mx.com.practica.reino.Anfibio;
import mx.com.practica.reino.Ave;
import mx.com.practica.reino.Mamifero;
import mx.com.practica.reino.Pez;
import mx.com.practica.reino.Reptil;
import mx.com.practica.zoologico.alimento.Alimento;
import mx.com.practica.zoologico.alimento.CarneBlanca;
import mx.com.practica.zoologico.alimento.CarneRoja;
import mx.com.practica.zoologico.alimento.Insecto;
import mx.com.practica.zoologico.alimento.Plancton;
import mx.com.practica.zoologico.alimento.Semilla;
import mx.com.practica.zoologico.alimento.Vegetal;

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
		for (Animal animal : zoologico) {
		}
	}
	
	public void temporadaDeAlimentacion(){
		double porcion;
		Alimento alimento=null;
		for (Animal animal : zoologico) {
			porcion=animal.getPeso()*0.01;
			if (animal instanceof Mamifero) {
				alimento=new CarneRoja();
				//alimento=new CarneBlanca();
				//alimento=new Vegetal();
				((Mamifero) animal).alimentarse(porcion, alimento);
			} else if (animal instanceof Pez) {
				alimento=new Plancton();
			//	((Pez) animal).alimentarse(porcion, alimento);
			}else if(animal instanceof Ave){
				alimento=new Vegetal();
				//alimento=new Semilla();
	//			((Ave) animal).alimentarse(porcion, alimento);
			}else if(animal instanceof Reptil){
				alimento=new Insecto();
		//		((Reptil) animal).alimentarse(porcion, alimento);
			}else if(animal instanceof Anfibio){
				
			}
		}
	}

}
