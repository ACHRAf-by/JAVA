package TpNote;

public class Operation {

    private final int numero;
    private final String date;
    private final double montant;

    Operation(int numero, String date, double montant) {
        this.numero = numero;
        this.date = date;
        this.montant = montant;
    }


    public int getNumero() {
        return numero;
    }

    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }
}
