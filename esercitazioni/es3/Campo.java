public abstract class Campo { // aggiungi "abstract"
    private int codice; // aggiungi "private" a tutti
    private String nome;
    private float larghezza, lunghezza, costo;

    private int prenotazioni;

    public Campo(int codice, String nome, float larghezza, float lunghezza, float costo) {
        this.codice = codice;
        this.nome = nome;
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        this.costo = costo;
    }

    public void addPrenotazione() {
        prenotazioni++;
    }

    public float incasso() {
        return prenotazioni * costo;
    }

    protected float getCosto() {
        return costo;
    }

    public String toString() {
        return String.format("%20s %4d %4.2f %4.2f", nome, codice, larghezza, lunghezza);
    }
}
