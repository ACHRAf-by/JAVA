package com.company;

public class Personnel {

    private String nom;
    private String prenom;
    private int age;
    private String profession;

    public Personnel(String nom, String prenom, int age, String profession) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.profession = profession;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }
}
