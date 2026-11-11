public class Racchetta extends Articolo {
  private int peso;

  public Racchetta(int codice, String marca, String modello,
      int peso, float prezzo, int sconto) {
    super(codice, marca, modello, prezzo, sconto);
    this.peso = peso;
  }

  public String toString() {
    return String.format("%10s ", "racchetta") + super.toString() +
        String.format(" %6s %6d %8.2f %5d%%", "-", peso, prezzo, sconto);
  }
}