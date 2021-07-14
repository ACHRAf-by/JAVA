package com.jetbrains;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Livre l1 = new Livre("Victor Hugo" , "Les misérables");
        l1.setNbPages(128);
        Livre l2 = new Livre("Achraf" , "Rabie adventures");
        l2.setNbPages(308);
        System.out.println("\nLivre 1 \nAuteur : " + l1.getAuteur() + "\nTitre : " + l1.getTitre() + "\nnbPages : " + l1.getNbPages());
        System.out.println("\nLivre 2 \nAuteur : " + l2.getAuteur() + "\nTitre : " + l2.getTitre() + "\nnbPages : " + l2.getNbPages());

        int Sommes = l1.getNbPages() + l2.getNbPages();
        System.out.println("La somme des pages est : " + Sommes);
    }
}
