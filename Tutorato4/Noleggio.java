public class Noleggio{
    protected String targa;
    protected int numero_giorni;
    protected double costoGiornaliero;

    public Noleggio(String targa, int numero_giorni, double costoGiornaliero){
        this.targa = targa;
        this.numero_giorni = numero_giorni;
        this.costoGiornaliero = costoGiornaliero;
    }

    public double getSpesa(){
        return numero_giorni*costoGiornaliero;
    }

    public String toString(){
        return "(" + targa + ", " + numero_giorni + ")";
    }
}
