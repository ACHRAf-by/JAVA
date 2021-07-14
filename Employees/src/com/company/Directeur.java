package com.company;

import java.util.ArrayList;
import java.util.List;

public class Directeur extends Personnel {

    List<Employe> employeList = new ArrayList<>();

    public Directeur(String nom, String prenom, int age, String profession) {
        super(nom, prenom, age, profession);
    }

    public void addEmploye(Employe e) {
        if (e.getAge() < 65 && !e.getProfession().equals("Cuisinier")) {
            employeList.add(e);
        }
    }

    public void showEmployees() {
        System.out.println("Employées : ");
        for (Employe employe : employeList) {
            System.out.println(employe.getNom() + " " + employe.getPrenom() + " " + employe.getAge() + " ans " + "/" + employe.getProfession());
        }
    }

    @Override
    public String toString() {
        return "Directeur : " + getNom() + " " + getPrenom() + " " + getAge() + " ans " + "/" + getProfession();
    }

}
