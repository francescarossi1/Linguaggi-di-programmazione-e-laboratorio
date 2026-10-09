
public class Azione extends Film {

    public Azione(String id, String titolo) {
        super(id, titolo);
        this.penale = 3.0;
    }

    public double calcolaPenale(int ritardo) {
        if (ritardo > 3) {
            return this.penale * 3 + (this.penale + 1) * (ritardo - 3);
        } else
            return this.penale * ritardo;
    }
}