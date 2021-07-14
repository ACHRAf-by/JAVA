package TpNote;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Compte {

    private final int code;
    private double solde;

    // Listes de versements et de retraits
    List<Versement> versementList = new ArrayList<>();
    List<Retrait> retraitList = new ArrayList<>();

    private static final AtomicInteger count = new AtomicInteger(0);

    Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    // verser le montant dans le compte en ajoutant l'operation à la liste
    void verser(double montant) {
        solde = getSolde() + montant;
        int uniqueID = count.incrementAndGet();
        Versement v = new Versement(uniqueID, "30/11/2020", montant);
        versementList.add(v);
    }

    // retirer le montant du compte en ajoutant l'operation à la liste
    void retirer(double montant) throws RetraitException {
        solde = getSolde() - montant;
        int uniqueID = count.incrementAndGet();
        Retrait r = new Retrait(uniqueID, "30/11/2020", montant);
        retraitList.add(r);
    }

    // virement d'un compte à un autre
    void virement(double montant, Compte compte) throws RetraitException {
        retirer(montant);
        compte.verser(montant);
    }

    double ConsulterSolde() {
        return getSolde();
    }

    void updateSolde() {
    }

    // Lister les operations effectuées et les afficher
    void listerOperations() {
        for (Versement versement : versementList) {
            System.out.println("Versement : " + versement.getNumero() + " | date : " + versement.getDate()
                    + " | montant : " + versement.getMontant());
        }
        for (Retrait retrait : retraitList) {
            System.out.println("Retrait : " + retrait.getNumero() + " | date : " + retrait.getDate()
                    + " | montant : " + retrait.getMontant());
        }
    }

    // Calculer le total de versements sur un compte
    double totalVersement() {
        double totalVersement = 0;
        for (Versement versement : versementList) {
            totalVersement = totalVersement + versement.getMontant();
        }
        return totalVersement;
    }

    // Calculer le total de retraits sur un compte
    double totalRetrait() {
        double totalRetrait = 0;
        for (Retrait retrait : retraitList) {
            totalRetrait = totalRetrait + retrait.getMontant();
        }
        return totalRetrait;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

}
