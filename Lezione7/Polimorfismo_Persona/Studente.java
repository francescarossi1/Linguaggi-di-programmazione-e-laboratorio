public class Studente extends Persona {
    protected int matr;

    public Studente(String nome, int eta, int matricola) {
        super(nome, eta);
        matr = matricola;
    }

    public void print() {
        super.print();
        System.out.println("Matricola= " + matr);
    }

}
