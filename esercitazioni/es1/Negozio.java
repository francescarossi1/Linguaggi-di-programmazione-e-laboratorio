
import java.util.*;

public class Negozio {
    private int codice;
    private String nome;
    private String indirizzo;
    private Map<Integer, Integer> magazzino; // codice articolo -> quantità

    public Negozio(int codice, String nome, String indirizzo) {
        this.codice = codice;
        this.nome = nome;
        this.indirizzo = indirizzo;
        magazzino = new LinkedHashMap<Integer, Integer>();
    }

    public void addArticolo(int codiceArticolo, int quantita) {
        magazzino.put(codiceArticolo, quantita);
    }

    public int getNumeroOggetti() {
        int somma = 0;
        for (int q : magazzino.values())
            somma += q;
        return somma;
    }

    // Servirà per il punto 3: 0 se l'articolo non è in magazzino
    public int getQuantita(int codiceArticolo) {
        Integer q = magazzino.get(codiceArticolo);
        return (q == null) ? 0 : q;
    }

    private String magazzinoToString() {
        List<String> coppie = new ArrayList<String>();
        for (int codiceArticolo : magazzino.keySet())
            coppie.add("(" + codiceArticolo + ", " + magazzino.get(codiceArticolo) + ")");
        return coppie.toString();
    }

    public static String intestazione() {
        return String.format("%6s %-16s %-20s %14s %s",
                "Codice", "Nome", "Indirizzo", "Numero oggetti", "Magazzino");
    }

    public String toString() {
        return String.format("%6d %-16s %-20s %14d ",
                codice, nome, indirizzo, getNumeroOggetti()) + magazzinoToString();
    }
}