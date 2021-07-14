package Java.projects;

public class Pneu {

    private  final int largeur;
    private String marque;

    Pneu(int largeur) {
        this.largeur = largeur;
    }

    void marquePneu(Voiture v) {
        if (v.getMarque().equals("Renault")) {
            marque = "Continental";
        } else {
            marque = "Michelin";
        }
    }

    @Override
    public String toString() {
        return "Pneu { " +
                " largeur = " + largeur +
                ", marque = " + marque +
                " } ";
    }
}
