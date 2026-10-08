
public class Film {
    protected String codice;
    protected String titolo;
    protected double penaleGiornaliera;

    public Film(String codice, String titolo) {
        this.codice = codice;
        this.titolo = titolo;
    }

    public double calcolaPenale(int ritardo) {
        return this.penaleGiornaliera * ritardo;
    }

    public String toString() {
        return "[codice= " + this.codice + ", titolo= " + this.titolo + ", penale giornaliera= "
                + this.penaleGiornaliera
                + " ]";
    }
}
