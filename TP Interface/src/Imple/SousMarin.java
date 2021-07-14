package Imple;

public class SousMarin implements Vehicule, Submersible {

	private int profondeurMax;

	public SousMarin(int profondeurMax) {
		super();
		this.profondeurMax = profondeurMax;
	}

	public int getProfondeurMax() {
		return profondeurMax;
	}

	public void setProfondeurMax(int profondeurMax) {
		this.profondeurMax = profondeurMax;
	}

	@Override
	public String toString() {
		return "SousMarin [profondeurMax=" + profondeurMax + "]";
	}

	@Override
	public int getVitesseMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVitesseMax(int vitesse) {
		// TODO Auto-generated method stub
		
	}
	
}
