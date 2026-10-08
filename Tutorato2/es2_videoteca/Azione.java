public class Azione extends Film {

    public Azione(String codice, String titolo) {
        super(codice, titolo);
        this.penaleGiornaliera = 3.0;
    }

    public double calcolaPenale(int ritardo) {
        if (ritardo <= 3) {
            return this.penaleGiornaliera * ritardo;
        } else {
            return this.penaleGiornaliera * ritardo + (ritardo - 3) * 4.0;
        }
    }
}