package mx.com.practica.reino;

import mx.com.practica.zoologico.alimento.Alimento;

public interface Mamifero {
	
	abstract void dormir();
	abstract void alimentarse(double porcion, Alimento alimento);
}
