public class EsempioGioco {
    public static void main(String[] args) {
        GruppoAlieni ga = new GruppoAlieni(3);

        ga.aggiungiAlieno(new AlienoSerpente(100, "Ratiss"), 0);
        ga.aggiungiAlieno(new AlienoOrco(100, "Azog"), 1);
        ga.aggiungiAlieno(new AlienoUmanoMarshmallow(100, "Monk"), 2);

        System.out.println("Danno totale: " + ga.calcolaDanno());
    }
}
