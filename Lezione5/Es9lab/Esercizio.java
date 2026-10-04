public class Esercizio {
    public static void main(String[] args) {
        Orologio or;
        or = new Orologio();
        or.Azzera();

        for (int i = 0; i < 130; i++) {
            or.tic();
        }
        System.out.println("ore: " + or.getOre());
        System.out.println("minuti: " + or.getMinuti());
        or.Azzera();
    }
}