public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Francesca", 19);
        p.print();

        Studente s = new Studente("Bruno", 20, 1234);
        s.print();

        p = s; // p diventa riferimento a un oggetto studente
        p.print();
    }
}
