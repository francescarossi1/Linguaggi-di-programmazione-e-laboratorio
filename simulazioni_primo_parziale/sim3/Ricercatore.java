import java.util.LinkedList;
import java.util.List;

public class Ricercatore {
    String nome_ric;
    String cognome_ric;
    List<Impegno> progetti;

    public Ricercatore(String nome, String cognome) {
        this.nome_ric = nome;
        this.cognome_ric = cognome;
        progetti = new LinkedList<Impegno>();

    }

    public double getOreTotali() {
        double ore = 0;
        for (Impegno i : progetti) {
            ore += i.getOre();
        }
        return ore;
    }

    public void addProgetto(Progetto p, double ore) {
        progetti.add(new Impegno(p, ore));
    }

    // punto 5
    public int getNum() {
        return progetti.size();
    }

    public String getCognome() {
        return cognome_ric;
    }

    public String getNome() {
        return nome_ric;
    }

    public Impegno getMax() {
        double max = 0;
        Impegno impegno = null;
        for (Impegno i : progetti) {
            if (i.getOre() > max) {
                max = i.getOre();
                impegno = i;
            }
        }
        return impegno;
    }

    @Override
    public String toString() {
        return nome_ric + "\t" + cognome_ric + "\t" + getOreTotali();
    }
}
