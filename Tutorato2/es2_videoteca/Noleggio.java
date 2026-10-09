public class Noleggio {
    private Film film;
    private int ritardo;
    private String cliente;

    public Noleggio(Film film, int ritardo, String cliente) {
        this.film = film;
        this.ritardo = ritardo;
        this.cliente = cliente;
    }

    public double calcolaPenale() {
        return film.calcolaPenale(this.ritardo);
    }

    public String toString() {
        return "{film = " + this.film + "\t cliente = " + this.cliente + "\t ritardo = " + this.ritardo
                + "\t penale totale = " + this.calcolaPenale() + "}";
    }

}