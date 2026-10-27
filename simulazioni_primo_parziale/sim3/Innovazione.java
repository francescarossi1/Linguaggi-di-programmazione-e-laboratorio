public class Innovazione extends Progetto {
    protected int num_aziende;

    public Innovazione(int codice, String titolo, String nome, String organizzatore, double importo_tot,
            int num_aziende) {
        super(codice, titolo, nome, organizzatore, importo_tot);
        this.num_aziende = num_aziende;

    }

    public String toString() {
        return "Ricerca \t" + super.toString() + "-\t" + "-\t" + "\t" + num_aziende + "\t" + getImporto();
    }
}
