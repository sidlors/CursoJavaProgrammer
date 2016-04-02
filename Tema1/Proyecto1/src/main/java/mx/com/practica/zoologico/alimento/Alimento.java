package mx.com.practica.zoologico.alimento;

public abstract class Alimento {

	protected double proteina;
	protected double vitamina;
	protected double mineral;
	protected double grasa;
	protected double carbohidrato;
	
	
	
	public double getProteina() {
		return proteina;
	}
	public void setProteina(double proteina) {
		this.proteina = proteina;
	}
	public double getVitamina() {
		return vitamina;
	}
	public void setVitamina(double vitamina) {
		this.vitamina = vitamina;
	}
	public double getMineral() {
		return mineral;
	}
	public void setMineral(double mineral) {
		this.mineral = mineral;
	}
	public double getGrasa() {
		return grasa;
	}
	public void setGrasa(double grasa) {
		this.grasa = grasa;
	}
	public double getCarbohidrato() {
		return carbohidrato;
	}
	public void setCarbohidrato(double carbohidrato) {
		this.carbohidrato = carbohidrato;
	}
	
	
}
