public class Auto extends Veicolo{
    protected int cilindrata; 
    protected double bagagliaio; 

    public Auto(int codice, String targa, String modello, String marca, double costo, int cilindrata , double bagagliaio)
    {
        super(codice, targa, modello, marca, costo); 
        this.cilindrata=cilindrata; 
        this.bagagliaio=bagagliaio; 
    }

    public String tString()
    {
        return "automobile\t"+super.toString()+cilindrata+"\t"+bagagliaio+"\t-\t-\t-";
    }
}
