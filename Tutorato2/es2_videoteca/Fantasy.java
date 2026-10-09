
public class Fantasy extends Film {

    public Fantasy(String id, String titolo) {
        super(id, titolo);
        this.penale = 2.0;
    }

    public double calcolaPenale(int ritardo) {
        if (ritardo == 1) {
            return this.penale / 2;
        } else
            return this.penale * ritardo;
    }

}