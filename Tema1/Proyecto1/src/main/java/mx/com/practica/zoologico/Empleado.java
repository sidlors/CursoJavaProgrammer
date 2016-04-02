package mx.com.practica.zoologico;

import mx.com.practica.animales.Animal;
import mx.com.practica.reino.Carnivoro;
import mx.com.practica.reino.Herbivoro;
import mx.com.practica.reino.Oviparo;

public class Empleado implements Zootecnista {

	@Override
	public void alimentaAnimal(Animal animal) {
		//TODO Crear La logica para alimentar animales
		if (animal instanceof Herbivoro) {
			//type new_name = (type) animal;
			
		}else if(animal instanceof Carnivoro){
			
		}else if(animal instanceof Oviparo){
			
		}
		
	}

	@Override
	public void curaAnimal(Animal animal) {
		// TODO Auto-generated method stub
		
	}

}
