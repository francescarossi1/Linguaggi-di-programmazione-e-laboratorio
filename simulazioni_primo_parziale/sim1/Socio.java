import java.util.ArrayList;
import java.util.List;

public class Socio {
  int codice, età, categoria;
  String nome;
  List<Prenotazione> prenotazioni;

  public Socio(int codice, int età, int categoria, String nome) {
    this.codice = codice;
    this.età = età;
    this.categoria = categoria;
    this.nome = nome;
    prenotazioni = new ArrayList<Prenotazione>();
  }

  public void addPren(Prenotazione p) {
    prenotazioni.add(p);
  }

  public String toString() {
    return String.format("%3d %30s %3d %4d ", codice, nome, età, categoria) + prenotazioni;
  }

}
