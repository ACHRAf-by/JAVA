package Java.projects;

public class Moto extends Vehicule {
    private String puissance;

    public Moto(String couleur, Pneu pneu, String marque, String modele) {
        super(couleur, pneu, marque, modele);
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public String getPuissance() {
        return puissance;
    }
    @Override
    public String toString() {
        return getMarque() + " " + getModele() + " " +  getCouleur() + ", " + "Pneumatique : " + getPneu().getMarque();
    }
}
