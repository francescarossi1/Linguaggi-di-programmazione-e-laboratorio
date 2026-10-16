public class Fattura {
    private Dottore dottore;
    private Paziente paziente;

    public Fattura (Dottore dottore, Paziente paziente){
        this.dottore = dottore;
        this.paziente = paziente;
    }

    public String getNomePaziente(){
        return this.paziente.getNome();
    }

    public String getIdPaziente(){
        return this.paziente.getId();
    }

    public String getNomeDottore(){
        return this.dottore.getNome();
    }

    public double getImporto(){
        return this.dottore.getParcella();
    }

    public boolean equals(Fattura altraFattura){
        return this.dottore.equals(altraFattura.dottore) && this.paziente.equals(altraFattura.paziente);
    }
}
