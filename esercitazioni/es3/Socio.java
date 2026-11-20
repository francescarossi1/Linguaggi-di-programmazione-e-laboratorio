import java.util.*;

public class Socio {
    private int codice, eta, categoria;
    private String nome;
    private List<Prenotazione> prenotazioni;

    public Socio(int codice, String nome, int eta, int categoria) {
        this.codice = codice;
        this.nome = nome;
        this.eta = eta;
        this.categoria = categoria;
        prenotazioni = new ArrayList<Prenotazione>();
    }

    public void addPrenotazione(Prenotazione p) {
        prenotazioni.add(p);
    }

    public String toString() {
        return String.format("%4d %20s %4d %4d %s", codice, nome, eta, categoria, prenotazioni);
    }
}
