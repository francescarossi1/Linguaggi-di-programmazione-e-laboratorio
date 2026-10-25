public class Campo {
  int codice;
  String nome;
  float larghezza, lunghezza, costo;
  
  int prenotazioni;

  public Campo(int codice, String nome, 
    float larghezza, float lunghezza, float costo)
  {
    this.codice=codice;
    this.nome=nome;
    this.larghezza=larghezza;
    this.lunghezza=lunghezza;
    this.costo=costo;
    prenotazioni = 0;
  }

  public String toString()
  {
   // return nome+"\t"+codice+"\t"+larghezza+"\t"+lunghezza;
     return String.format("%20s %6d %8.2f %8.2f",
    nome,codice,larghezza,lunghezza);

  }

  public void addPren(){
    prenotazioni++; 
  }

  public float getIncasso(){
    return costo * prenotazioni;
  }
  
}
