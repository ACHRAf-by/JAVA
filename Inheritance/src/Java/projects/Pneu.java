package Java.projects;

public class Pneu {

    private String marque;
    private final String type;
    private final String largeur;


    Pneu(String type, String largeur) {
        this.type = type;
        this.largeur = largeur;
    }

    public String getType() {
        return type;
    }

    public String getLargeur() {
        return largeur;
    }

    void marquePneu(Vehicule v) {
        if (v.getMarque().equals("Renault") && type.equals("Voiture")) {
            marque = "Continental pour voiture";
        } else marque = "Continental pour moto";

        if (v.getMarque().equals("Yamaha")) {
            marque = "Dunlop pour moto";
        } else if (type.equals("Voiture")) {
            marque = "Michelin pour voiture";
        } else marque = "Michelin pour moto";
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
