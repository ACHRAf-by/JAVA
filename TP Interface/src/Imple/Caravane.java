package Imple;

public class Caravane implements Habitat, Vehicule {

	private int vitesseMax;
	
	public Caravane(int vitesseMax) {
		super();
		this.vitesseMax = vitesseMax;
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	@Override
	public int getSurface() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSurface(int surface) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrix(double prix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Caravane [vitesseMax=" + vitesseMax + "]";
	}
	
	

}
