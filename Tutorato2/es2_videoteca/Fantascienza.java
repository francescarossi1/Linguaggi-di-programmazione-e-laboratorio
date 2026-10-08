public class Fantascienza extends Film {

    public Fantascienza(String codice, String titolo) {
        super(codice, titolo);
        this.penaleGiornaliera = 2.5;
    }

    public double calcolaPenale(int ritardo) {
        return this.penaleGiornaliera * ritardo;
    }
}