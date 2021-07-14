package Java.projects;


public class Main {

    public static void main(String[] args) {
        Pneu p1 = new Pneu("Voiture", "225mm");
        Voiture v1 = new Voiture("noire", p1, "Renault", "clio5");
        v1.setCategory("Sport");
        p1.marquePneu(v1);

        Pneu p2 = new Pneu("Moto", "125mm");
        Moto m1 = new Moto("gris", p2, "Yamaha", "YBR");
        m1.setPuissance("750");
        p2.marquePneu(m1);

        Pneu p3 = new Pneu("Moto", "125mm");
        Moto m2 = new Moto("vert", p3, "Suzuki", "ZR-250");
        m2.setPuissance("1000");
        p3.marquePneu(m2);

        System.out.println(v1.toString());
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
