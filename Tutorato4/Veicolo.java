public class Veicolo{
    protected int codice;
    protected String targa;
    protected String modello;
    protected String marca;
    protected double costoGiornaliero;

    public Veicolo(int codice, String targa, String modello, String marca, double costoGiornaliero){
        this.codice = codice;
        this.targa = targa;
        this.modello = modello;
        this.marca = marca;
        this.costoGiornaliero = costoGiornaliero;
    }

    public String getTarga(){
        return targa;
    }

    public int getCodice(){
        return codice;
    }

    public String toString(){
        return targa + "\t" + codice + "\t" + modello + "\t" + marca + "\t" + costoGiornaliero;
    }
}