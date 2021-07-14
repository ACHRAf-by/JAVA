package Java.projects;

import java.util.ArrayList;

public class Concessionnaire {
    private String adresse;
    private int cp;
    private String ville;

    ArrayList<Voiture> citroen = new ArrayList<>();
    ArrayList<Voiture> peugeot = new ArrayList<>();
    ArrayList<Voiture> renault = new ArrayList<>();



    Concessionnaire(String adresse, int cp, String ville) {
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
    }

    void addVoiture(Voiture v){
        if (v.getMarque().equals("Citroen")){
            citroen.add(v);
        }
        if(v.getMarque().equals("Renault")){
            renault.add(v);
        }
        if(v.getMarque().equals("Peugeot")){
            peugeot.add(v);
        }
    }

    void deleteVoiture(Voiture v){
        if (v.getMarque().equals("Citroen")){
            citroen.remove(v);
        }
        if(v.getMarque().equals("Renault")){
            renault.remove(v);
        }
        if(v.getMarque().equals("Peugeot")){
            peugeot.remove(v);
        }
    }

    public ArrayList<Voiture> getCitroen() {
        return citroen;
    }

    public ArrayList<Voiture> getPeugeot() {
        return peugeot;
    }

    public ArrayList<Voiture> getRenault() {
        return renault;
    }

    public int getCp() {
        return cp;
    }

    public String getVille() {
        return ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Concessionnaires { " + "\n" +
                "citroen = " + citroen + "\n" +
                "peugeot = " + peugeot + "\n" +
                "renault = " + renault + "\n" +
                "}";
    }
}
