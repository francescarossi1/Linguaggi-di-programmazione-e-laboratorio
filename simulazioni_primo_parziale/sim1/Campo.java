public class Campo {
    int codice;
    String nome;
    float larghezza, lunghezza, costo;

    public Campo(int codice, String nome,
            float larghezza, float lunghezza, float costo) {
        this.codice = codice;
        this.nome = nome;
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        this.costo = costo;
    }

    public String toString() {
        return nome + "\t" + codice + "\t" + larghezza + "\t" + lunghezza;
        // return String.format("%15s %2d %4.2f %4.2f",
        // nome,codice,larghezza,lunghezza);

    }

}
