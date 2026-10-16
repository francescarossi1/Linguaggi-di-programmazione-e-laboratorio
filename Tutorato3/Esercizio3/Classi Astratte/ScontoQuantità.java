class ScontoQuantità extends PoliticaSconto{
    private int minimo;
    private int percentuale;
    private double sconto;

    public ScontoQuantità(int minimo, int percentuale){
        this.minimo = minimo;
        this.percentuale = percentuale;
    }

    public double calcolaSconto(int numeroArticoli, double prezzoArticolo){
        if(numeroArticoli > this.minimo){
            sconto = ((prezzoArticolo*numeroArticoli) * percentuale)/100.0;
        } 
        else {
            sconto = 0.0;
        }
        return sconto;
    }
}
