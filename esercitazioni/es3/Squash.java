public class Squash extends Campo {
    private float altezza;
    private int piano;

    public Squash(int codice, String nome, float larghezza, float lunghezza, float costo, float altezza, int piano) {
        super(codice, nome, larghezza, lunghezza, costo);
        this.altezza = altezza;
        this.piano = piano;
    }

    public String toString() {
        return String.format("squash %s %20s %20s %4.2f %4d %4.2f",
                super.toString(), "-", "-", altezza, piano, getCosto());
    }
}
