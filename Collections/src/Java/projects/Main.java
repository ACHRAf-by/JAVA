package Java.projects;

public class Main {

    public static void main(String[] args) {

        Concessionnaire c1 = new Concessionnaire("184 Georges clemenceau", 92000, "Nanterre");
        Pneu p1 = new Pneu(25);
        Pneu p2 = new Pneu(30);
        Pneu p3 = new Pneu(30);
        Pneu p4 = new Pneu(30);
        Voiture v1 = new Voiture("noir", "Citroen", "C1", "Sport", p1);
        Voiture v2 = new Voiture("blanc", "Renault", "clio", "Sport", p2);
        Voiture v3 = new Voiture("bleu", "Peugeot", "208", "Citadine", p3);
        Voiture v4 = new Voiture("bleu", "Citroen", "C4", "Routiere", p4);

        p1.marquePneu(v1);
        p2.marquePneu(v2);
        p3.marquePneu(v3);
        p4.marquePneu(v4);


        c1.addVoiture(v1);
        c1.addVoiture(v2);
        c1.addVoiture(v3);
        c1.addVoiture(v4);


        System.out.println(c1.toString());




    }
}
