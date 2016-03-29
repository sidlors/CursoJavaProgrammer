package mx.com.practica.zoologico;

public class Conejo extends Animal {


	public Conejo(){
		System.out.println("Conejo creado");
	}

	@Override
	Animal procrea() {
		Conejo conejo=new Conejo();
		return conejo;
	}

}
