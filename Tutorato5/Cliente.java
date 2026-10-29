import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nomeCognome;
    private List<Noleggio> noleggi;

    public Cliente(String nomeCognome) {
        this.nomeCognome = nomeCognome;
        this.noleggi = new ArrayList<Noleggio>();
    }

    public void addNoleggio(String targa, int giorni, double costo) {
        noleggi.add(new Noleggio(targa, giorni, costo));
    }

    public double getTotale() {
        double tot = 0;
        for (Noleggio n : noleggi) {
            tot += n.getTotale();
        }
        return tot;
    }

    public String toString() {
        return nomeCognome + "\t" + this.getTotale() + "\t" + noleggi.size() + "\t" + noleggi;
    }
}
