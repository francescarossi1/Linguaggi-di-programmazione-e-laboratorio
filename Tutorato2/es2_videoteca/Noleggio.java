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
        return this.film.calcolaPenale(this.ritardo);
    }

    public String toString() {
        return "[film=" + this.film
                + ", cliente=" + this.cliente
                + ", ritardo=" + this.ritardo
                + ", penale totale=" + calcolaPenale() + "]";
    }
}