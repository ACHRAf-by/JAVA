package TpNote;

public class Main {

    public static void main(String[] args) throws RetraitException {
        System.out.println("Creation de comptes : ");
        CompteCourant c1 = new CompteCourant(7777, 1200.50, 200);
        CompteCourant c2 = new CompteCourant(6666, 250, 200);
        CompteEpargne e1 = new CompteEpargne(0, 300, 1.2);
        CompteEpargne e2 = new CompteEpargne(1234, 50, 2.0);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(e1.toString());
        System.out.println(e2.toString());

        System.out.println("------------------------------------------------");

        System.out.println("Virement du compte c1 au compte c2 : ");
        c1.virement(100, c2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("------------------------------------------------");


        System.out.println("Mettre à jour le CompteEpargne e1 avec le taux d'interet : ");
        e1.updateSolde();
        System.out.println(e1.toString());

        System.out.println("------------------------------------------------");


        System.out.println("Test retrait : ");
        //c2.retirer(200);
        e1.retirer(400);

        System.out.println("------------------------------------------------");


        System.out.println("Lister les operations sur le compte c1 : ");
        c1.verser(100);
        c1.retirer(100);
        c1.listerOperations();

        System.out.println("------------------------------------------------");


        System.out.println("Lister les operations sur le compte c2 : ");
        c2.listerOperations();

        System.out.println("------------------------------------------------");


        System.out.println("Lister les operations sur le compte e1 : ");
        e1.listerOperations();

        System.out.println("------------------------------------------------");


        System.out.println("Lister les operations sur le compte e2 : ");
        e2.listerOperations();

        System.out.println("------------------------------------------------");


        System.out.println("Versement et Retrait total sur le compte c1 : ");
        System.out.println("versement : " + c1.totalVersement());
        System.out.println("retrait : " + c1.totalRetrait());

        System.out.println("------------------------------------------------");


        System.out.println("Versement total sur le compte c2 : ");
        System.out.println("versement : " + c2.totalVersement());
        System.out.println("retrait : " + c2.totalRetrait());


    }
}
