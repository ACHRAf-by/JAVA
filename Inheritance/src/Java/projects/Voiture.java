package Java.projects;

public class Voiture extends Vehicule {

    private String category;

    public Voiture(String couleur, Pneu pneu, String marque, String modele) {
        super(couleur, pneu, marque, modele);
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return getMarque() + " " + getModele() + " " +  getCouleur() + ", " + "Pneumatique : " + getPneu().getMarque();
    }
}
