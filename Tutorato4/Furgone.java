public class Furgone extends Veicolo{
    protected boolean rimorchio;
    protected int numeroposti;
    protected boolean vanodicarico;
    
    public Furgone(int codice, String targa, String modello, String marca, boolean rimorchio, int numeroposti, boolean vanodicarico, double costoGiornaliero){
        super(codice, targa, modello, marca, costoGiornaliero);
        this.rimorchio = rimorchio;
        this.numeroposti = numeroposti;
        this.vanodicarico = vanodicarico;
    }

    public String toString(){
        return "Furgone\t" + super.toString() + "\t-\t-\t-\t" + rimorchio + "\t" + numeroposti + "\t" + vanodicarico;   
    }
}