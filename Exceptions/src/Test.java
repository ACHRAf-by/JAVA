import java.util.*;

public class Test {

    public static void main(String [] args){
        int a, b, res;

        try {
            Scanner sc = new Scanner(System.in);
            a= sc.nextInt(); b = sc.nextInt();
            res = a / b;
            System.out.println("le résultat de " + a + " divisé par " + b + " est " + res);
        } catch (Exception e) {
            System.out.println ("oops ! un problème dans la division ") ;
            System.out.println ("le message officiel est " + e.getMessage()) ;
        }
        finally {
            System.out.println("le bloc finally sera toujours exécuté") ;
            System.out.println("et c'est là que l'on fermera par exemple les fichiers") ;
        }
        System.out.println ("Fin du programme") ;
    }
}
