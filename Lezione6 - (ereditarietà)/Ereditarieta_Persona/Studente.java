package Ereditarieta_Persona;

public class Studente extends Persona {

    private String corsoDiLaurea;

    public Studente() {
        super();
        corsoDiLaurea = "Nessun corso";
    }

    public Studente(String nome, int eta, String corsoDiLaurea) {
        super(nome, eta);
        this.corsoDiLaurea = corsoDiLaurea;
    }

    public String getCorsoDiLaurea() {
        return corsoDiLaurea;
    }

    public void setCorsoDiLaurea(String nuovoCorso) {
        corsoDiLaurea = nuovoCorso;
    }

    @Override
    public void presentati() {
        System.out.println("Ciao, sono: " + getNome() + " e ho " + getEta() + " anni e studio " + corsoDiLaurea);
    }

}
