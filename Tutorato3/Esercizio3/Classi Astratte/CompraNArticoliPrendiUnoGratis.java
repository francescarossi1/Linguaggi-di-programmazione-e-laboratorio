public class CompraNArticoliPrendiUnoGratis extends PoliticaSconto{
    private int n;
    private double sconto;
    public CompraNArticoliPrendiUnoGratis(int n){
        this.n = n;
    }
    public double calcolaSconto(int numeroArticoli, double prezzoArticolo){
        sconto = numeroArticoli / n * prezzoArticolo;
        return sconto;
    }
}
