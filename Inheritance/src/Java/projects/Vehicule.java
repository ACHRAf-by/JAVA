package Java.projects;

public class Vehicule {
    private String couleur;
    private Pneu pneu;
    private String marque;
    private String modele;

    public Vehicule(String couleur, Pneu pneu, String marque, String modele) {
        this.couleur = couleur;
        this.pneu = pneu;
        this.marque = marque;
        this.modele = modele;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getModele() {
        return modele;
    }

    public Pneu getPneu() {
        return pneu;
    }

    public String getMarque() {
        return marque;
    }

}
