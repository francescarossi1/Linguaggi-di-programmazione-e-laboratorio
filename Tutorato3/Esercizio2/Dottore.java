public class Dottore extends Persona {
    private String specializzazione;
    private double parcella;
    
    public Dottore(){
        super();
    }

    public Dottore(String nome,String specializzazione,double parcella){
        super(nome);
        this.specializzazione = specializzazione;
        this.parcella = parcella;
    }

    public String getSpecializzazione(){
        return this.specializzazione;
    }

    public double getParcella(){
        return this.parcella;
    }

    public boolean equals(Dottore altrodottore){
        return super.equals(altrodottore) && this.specializzazione.equalsIgnoreCase(altrodottore.specializzazione);
    }
}
