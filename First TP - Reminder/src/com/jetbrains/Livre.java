package com.jetbrains;

public class Livre {
    //Variables
    private String titre, auteur ;
    private int nbPages ;

    //Constructeur
    public Livre(String unAureur , String unTitre){
        auteur = unAureur;
        titre = unTitre ;
    }

    //Accesseur
    public String getAuteur(){
        return auteur;
    }

    public String getTitre(){
        return titre;
    }

    public int getNbPages(){
        return nbPages;
    }

    //Modificateur
    public void setNbPages(int nb){
        if(nb > 0 ) nbPages = nb;
        else System.out.println("Error , This number cannot be negative ");
    }

    public void setAuteur(String unAuteur){
        auteur = unAuteur;
    }

    public void setTitre(String unTitre){
        titre = unTitre;
    }
}
