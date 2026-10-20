package Ereditarieta_Persona;

public class Persona {
    private String nome;
    private int eta;

    public Persona() {
        nome = "Ancora nessun nome";
        eta = 0;
    }

    public Persona(String nomeIniziale, int etaIniziale) {
        nome = nomeIniziale;
        eta = etaIniziale;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String nuovoNome) {
        nome = nuovoNome;
    }

    public void setEta(int nuovaEta) {
        eta = nuovaEta;
    }

    public void presentati() {
        System.out.println("Ciao, sono: " + nome + " e ho " + eta + " anni");
    }
}
