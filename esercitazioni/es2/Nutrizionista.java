public class Nutrizionista extends Dipendente {
    int telefono;
    boolean medico;
    int app_sett;

    public Nutrizionista(int codice, String nome, double costo, int telefono, boolean medico, int app_sett) {
        super(codice, nome, costo);
        this.telefono = telefono;
        this.medico = medico;
        this.app_sett = app_sett;
    }

    public String toString() {
        return super.toString()
                + String.format("%15s %4s %20s  %20d %20b %4d", "nutrizionista", "-", "-", telefono, medico, app_sett);
    }
}
