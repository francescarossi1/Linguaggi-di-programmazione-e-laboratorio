
public class Fantascienza extends Film {

    public Fantascienza(String id, String titolo) {
        super(id, titolo);
        this.penale = 2.5;
    }

    public double calcolaPenale(int ritardo) {
        return this.penale * ritardo;
    }

}