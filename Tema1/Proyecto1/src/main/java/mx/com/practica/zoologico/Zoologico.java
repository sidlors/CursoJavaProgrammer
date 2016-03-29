package mx.com.practica.zoologico;

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
	
	

}
