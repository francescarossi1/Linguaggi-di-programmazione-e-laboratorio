public class Pallone extends Articolo {
  private String taglia;

  public Pallone(int codice, String marca, String modello,
      String taglia, float prezzo, int sconto) {
    super(codice, marca, modello, prezzo, sconto);
    this.taglia = taglia;
  }

  public String toString() {
    return String.format("%10s ", "pallone") + super.toString() +
        String.format(" %6s %6s %8.2f %5d%%", taglia, "-", prezzo, sconto);
  }
}