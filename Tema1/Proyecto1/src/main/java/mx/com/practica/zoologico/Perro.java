package mx.com.practica.zoologico;

public class Perro extends Animal {
	
	
	public Perro(){
		
		System.out.println("Perro creado");
	}



	@Override
	Animal procrea() {
		Perro perro=new Perro();
		return perro;
	}

}
