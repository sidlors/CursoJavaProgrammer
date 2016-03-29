package mx.com.practica.animales;

public abstract class Animal {

	protected double peso;
	protected int edad;
	protected int sexo;



	protected void alimentarse(double porcion) {
		System.out.println("Se alimentara animal, Peso actual: " + peso);
		peso = peso + porcion;
		System.out.println("Se termia de alimentar animal, Peso Actual: " + peso);
	}

	

	abstract Animal procrea(Animal animal);

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

}
