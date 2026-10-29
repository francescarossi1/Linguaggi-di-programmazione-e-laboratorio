public class Veicolo {
    protected int codice;
    protected String targa, modello, marca;
    protected double costo;

    public Veicolo(int codice, String targa, String modello, String marca, double costo) {
        this.codice = codice;
        this.targa = targa;
        this.modello = modello;
        this.marca = marca;
        this.costo = costo;
    }

    public String getTarga() {
        return this.targa;
    }

    public int getCod() {
        return this.codice;
    }

    public String toString() {
        return targa + "\t" + codice + "\t" + modello + "\t" + marca + "\t" + costo;
    }

}