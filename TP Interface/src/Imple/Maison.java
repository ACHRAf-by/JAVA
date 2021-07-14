package Imple;
public class Maison implements Habitat {

	private int surface;
	private double prix;
	private String lieu;
	
	public Maison(int surface, double prix, String lieu) {
		super();
		this.surface = surface;
		this.prix = prix;
		this.lieu = lieu;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	@Override
	public String toString() {
		return "Maison [surface=" + surface + ", prix=" + prix + ", lieu=" + lieu + "]";
	}
	
}
	
	