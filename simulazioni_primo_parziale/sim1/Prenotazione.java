public class Prenotazione {
<<<<<<< HEAD
  int codice_campo, ora_inizio;
  public Prenotazione(int codice, int ora)
  {
    codice_campo=codice;
    ora_inizio=ora;
  }
  public String toString()
  {
    return "("+codice_campo+","+ora_inizio+")";
  }

  public int getCodice(){
    return codice_campo;
  }
=======
    int codice_campo, ora_inizio;

    public Prenotazione(int codice, int ora) {
        codice_campo = codice;
        ora_inizio = ora;
    }

    public String toString() {
        return "(" + codice_campo + "," + ora_inizio + ")";
    }
>>>>>>> de200cfe75cf0793f8eb753ac9c7d94db29db0f8
}
