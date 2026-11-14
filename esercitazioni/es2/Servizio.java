public class Servizio {
    double ore;
    Dipendente d;

    public Servizio(double ore, Dipendente d) {
        this.ore = ore;
        this.d = d;
    }

    public Dipendente getDipendente() {
        return d;
    }

    public double getOre() {
        return ore;
    }
}
