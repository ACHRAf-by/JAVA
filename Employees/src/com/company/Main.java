package com.company;

public class Main {

    public static void main(String[] args) {

        Directeur d1 = new Directeur("BEN YAHYA", "Achraf", 22, "Chef de projet");
        Employe p1 = new Employe("Kerouia", "Akram", 23, "Assistant");
        Employe p2 = new Employe("Bifi", "Louay", 22, "Developpeur");
        d1.addEmploye(p1);
        d1.addEmploye(p2);

        System.out.println(d1.toString());
        d1.showEmployees();
    }
}
