public class Film {
    protected String id;
    protected String titolo;
    protected double penale;

    public Film(String id, String titolo) {
        this.id = id;
        this.titolo = titolo;
    }

    public double calcolaPenale(int ritardo) {
        return penale * ritardo;
    }

    public String toString() {
        return "[codice = " + this.id + ", titolo = " + this.titolo + ", penale = " + this.penale + "]";
    }
}