public class Auto extends Veicolo {
    protected double capienza;
    protected int cilindrata;
    protected String categoria;

    public Auto(int codice, String targa, String modello, String marca, double capienza, int cilindrata, String categoria, double costoGiornaliero){
        super(codice,targa, modello, marca, costoGiornaliero);
        this.capienza = capienza;
        this.cilindrata = cilindrata;
        this.categoria = categoria;
    }

    public String toString(){
        return "Automobile\t" + super.toString() + "\t" + capienza + "\t" + cilindrata + "\t" + categoria + "\t" + "-\t-\t-";
    }
}
