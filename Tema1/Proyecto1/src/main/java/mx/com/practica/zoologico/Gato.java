package mx.com.practica.zoologico;

public class Gato extends Animal{


	public Gato(){
		System.out.println("Gato creado");
	}

	@Override
	Animal procrea() {
		Gato gato=new Gato();
		return gato;
	}

}
