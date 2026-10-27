public class Ricerca extends Progetto {
    protected String codice_argomento;
    protected int num_partner;

    public Ricerca(int codice, String titolo, String nome, String organizzatore, double importo_tot,
            String codice_argomento, int num_partner) {
        super(codice, titolo, nome, organizzatore, importo_tot);
        this.codice_argomento = codice_argomento;
        this.num_partner = num_partner;
    }

    public String toString() {
        return "Ricerca \t" + super.toString() + "\t" + codice_argomento + "\t" + num_partner + "-\t" + getImporto();
    }
}
