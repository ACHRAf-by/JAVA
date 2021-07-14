package Java.projects;


public class Voiture {
    private final String couleur;
    private final  String marque;
    private final String modele;
    private final  String catrgory;
    Pneu pneu;

    public Voiture(String couleur, String marque, String modele, String catrgory, Pneu pneu) {
        this.couleur = couleur;
        this.marque = marque;
        this.modele = modele;
        this.catrgory = catrgory;
        this.pneu = pneu;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getCatrgory() {
        return catrgory;
    }

    public Pneu getPneu() {
        return pneu;
    }


    @Override
    public String toString() {
        return modele + " ( " + catrgory + " ) " + pneu;
    }
}
