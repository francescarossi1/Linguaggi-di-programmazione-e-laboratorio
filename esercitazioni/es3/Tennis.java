public class Tennis extends Campo {
    private float temperatura;
    private String terreno;

    public Tennis(int codice, String nome, float larghezza, float lunghezza, float costo, float temperatura,
            String terreno) {
        super(codice, nome, larghezza, lunghezza, costo);
        this.temperatura = temperatura;
        this.terreno = terreno;
    }

    public String toString() {
        return String.format("tennis %s %4.2f %20s %20s %20s %4.2f",
                super.toString(), temperatura, terreno, "-", "-", getCosto());
    }
}
