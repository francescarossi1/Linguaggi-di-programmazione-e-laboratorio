public class Articolo {
  protected int codice;
  protected String marca;
  protected String modello;
  protected float prezzo;
  protected int sconto;

  public Articolo(int codice, String marca, String modello, float prezzo, int sconto) {
    this.codice = codice;
    this.marca = marca;
    this.modello = modello;
    this.prezzo = prezzo;
    this.sconto = sconto;
  }

  // punto 5
  public int getCodice() {
    return codice;
  }

  public String getMarca() {
    return marca;
  }

  public String getModello() {
    return modello;
  }

  public float getPrezzo() {
    return prezzo;
  }

  public String toString() {
    return String.format("%6d %15s %15s", codice, marca, modello);
  }
}