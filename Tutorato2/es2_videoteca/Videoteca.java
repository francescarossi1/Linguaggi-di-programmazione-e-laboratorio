public class Videoteca {

    public static void main(String[] args) {
      
        Film[] catalogo = new Film[5];
        catalogo[0] = new Fantascienza("Fz1", "Interstellar");
        catalogo[1] = new Fantasy("Fy1", "La Storia Infinita");
        catalogo[2] = new Azione("Az1", "Fast and Furious");
        catalogo[3] = new Azione("Az2", "Die Hard");
        catalogo[4] = new Fantasy("Fy2", "Harry Potter");

        Noleggio[] noleggi = new Noleggio[3];
        noleggi[0] = new Noleggio(catalogo[0], 4, "Adriano");
        noleggi[1] = new Noleggio(catalogo[1], 6, "Mia");
        noleggi[2] = new Noleggio(catalogo[2], 10, "Luigi");

        double penaleTotaleComplessiva = 0.0;

        for (Noleggio n : noleggi) {
            System.out.println(n);
            penaleTotaleComplessiva += n.calcolaPenale();
        }

        System.out.println("Il totale delle penali è: " + penaleTotaleComplessiva);
    }
}