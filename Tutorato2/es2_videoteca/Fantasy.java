public class Fantasy extends Film {

    public Fantasy(String codice, String titolo) {
        super(codice, titolo);
        this.penaleGiornaliera = 2.0;
    }

    public double calcolaPenale(int ritardo) {
        if (ritardo == 1) {
            return 1.0;
        } else {
            return this.penaleGiornaliera * ritardo;
        }
    }
}