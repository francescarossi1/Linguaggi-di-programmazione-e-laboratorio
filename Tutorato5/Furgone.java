public class Furgone extends Veicolo{
    protected String categoria; 
    protected int posti; 
    private boolean vano; 

    public Furgone(int codice, String targa, String modello, String marca, double costo, String categoria, int posti, boolean vano)
    {
        super(codice, targa, modello, marca, costo); 
        this.categoria=categoria; 
        this.posti= posti; 
        this.vano=vano; 
    }

    public String toString(){
        return "furgone \t"+super.toString()+"\t-\t-\t-"+posti+"\t"+categoria+"\t"+vano; 
    }
    
}
