package TpNote;

public class CompteEpargne extends Compte {
    private final double taux_interet;

    // Ajouter le taux spécifique pour le Compte Epargne
    CompteEpargne(int code, double solde, double taux_interet) {
        super(code, solde);
        this.taux_interet = taux_interet;
    }

    public double getTaux() {
        return taux_interet;
    }

    @Override
    void retirer(double montant) throws RetraitException {

        if (montant < getSolde()) {
            super.retirer(montant);
        } else
            throw new RetraitException("Vous ne pouvez pas effectuez ce retrait, le montant demandé est plus grand que votre solde");
    }

    // Mettre à jour le compte en basant sur le taux d'interet associé
    @Override
    void updateSolde() {
        double interet = (getTaux() / getSolde()) * 100;
        verser(interet);
    }

    @Override
    public String toString() {
        return "CompteEpargne : Code :  " + getCode() + " | Solde : " + getSolde() + " | Taux d'interet : " + getTaux();
    }
}
