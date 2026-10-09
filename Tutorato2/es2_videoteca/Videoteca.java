public class Videoteca {
    public static final int CAT = 5;
    public static final int NOL = 3;

    public static void main(String[] args) {

        Film[] catalogo = new Film[CAT];

        catalogo[0] = new Azione("Az1", "Fast and Furious");
        catalogo[1] = new Fantasy("Fy1", "La Storia Infinita");
        catalogo[2] = new Fantascienza("Fz1", "Interstellar");
        catalogo[3] = new Azione("Az2", "X-Men");
        catalogo[4] = new Fantascienza("Fz2", "Terminator");

        Noleggio[] noleggi = new Noleggio[NOL];
        noleggi[0] = new Noleggio(catalogo[2], 4, "Adriano");
        noleggi[1] = new Noleggio(catalogo[1], 6, "Mia");
        noleggi[2] = new Noleggio(catalogo[0], 10, "Luigi");

        System.out.println("Lista Noleggi:");
        for (int i = 0; i < noleggi.length; i++) {
            System.out.println(noleggi[i]);
        }

        /*
         * for(Noleggio noleggio : noleggi){
         * System.out.println(noleggio);
         * }
         */

        double totalePenali = 0.0;

        for (int i = 0; i < noleggi.length; i++) {
            totalePenali += noleggi[i].calcolaPenale();
        }

        /*
         * for(Noleggio noleggio : noleggi){
         * totalePenali += noleggio.calcolaPenale();
         * }
         */

        System.out.println("Il totale delle penali è: " + totalePenali);

    }

}