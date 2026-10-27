public class Progetto {
    protected int codice;
    protected String titolo;
    protected String nome;
    protected String organizzatore;
    double importo_tot;

    public Progetto(int codice, String titolo, String nome, String organizzatore, double importo_tot) {
        this.codice = codice;
        this.titolo = titolo;
        this.nome = nome;
        this.organizzatore = organizzatore;
        this.importo_tot = importo_tot;
    }

    public double getImporto() {
        return importo_tot;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getCode() {
        return codice;
    }

    @Override
    public String toString() {
        return titolo + "\t" + codice + "\t" + nome + "\t" + organizzatore + "\t";
    }

}
