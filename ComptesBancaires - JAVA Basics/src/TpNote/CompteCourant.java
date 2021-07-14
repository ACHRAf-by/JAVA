package TpNote;

public class CompteCourant extends Compte {
    private final int decouvert;

    // Ajouter le decouvert spécifique pour le Compte Courant
    CompteCourant(int code, double solde, int decouvert) {
        super(code, solde);
        this.decouvert = decouvert;
    }

    public int getDecouvert() {
        return decouvert;
    }

    @Override
    void retirer(double montant) throws RetraitException {
        double soldeFinal = getSolde() - montant;
        if (soldeFinal > decouvert) {
            super.retirer(montant);
        } else
            throw new RetraitException("Vous ne pouvez pas effectuez ce retrait, augmentez votre decouvert");
    }

    // Cette fonction est utilisé que pour le Compte Epargne où il y a le taux d'interet
    @Override
    void updateSolde() {
        super.updateSolde();
    }

    @Override
    public String toString() {
        return "CompteCourant : Code :  " + getCode() + " | Solde : " + getSolde() + " | Decouvert : " + getDecouvert();
    }
}
