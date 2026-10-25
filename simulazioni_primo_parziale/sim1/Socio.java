import java.util.ArrayList;
import java.util.List;

public class Socio {
<<<<<<< HEAD
  int codice, età, categoria;
  String nome;
  List<Prenotazione> prenotazioni;

  public Socio(int codice, int età, int categoria, String nome)
  {
    this.codice=codice;
    this.età=età;
    this.categoria=categoria;
    this.nome=nome;
    prenotazioni= new ArrayList<Prenotazione>();
  }

  public void addPren(Prenotazione p)
  {
    prenotazioni.add(p);
  }
  public String toString()
  {
    return String.format("%3d %30s %3d %4d ",codice,nome,età,categoria)+prenotazioni;
  }
  
  
=======
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
        return codice + "\t" + nome + "\t" + età + "\t" + categoria + "\t" + prenotazioni;
    }

>>>>>>> de200cfe75cf0793f8eb753ac9c7d94db29db0f8
}
