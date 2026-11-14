public class Dipendente {
    int codice;
    String nome;
    double costo_orario;

    public Dipendente(int codice, String nome, double costo_orario) {
        this.codice = codice;
        this.nome = nome;
        this.costo_orario = costo_orario;
    }

    public String toString() {
        return String.format("%20s %4d ", nome, codice);
    }

    public double getCosto() {
        return costo_orario;
    }

    // punto 5
    public String getNome() {
        return nome;
    }
}
