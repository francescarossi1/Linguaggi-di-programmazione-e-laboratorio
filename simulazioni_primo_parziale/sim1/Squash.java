<<<<<<< HEAD
public class Squash extends Campo{
  float altezza;
  int piano;
  public Squash(int codice, String nome, 
    float larghezza, float lunghezza, float costo,
    float altezza, int piano)
  {
    super(codice,nome,larghezza,lunghezza,costo);
    this.altezza=altezza;
    this.piano=piano;
  }
  
  public String toString()
  {
   // return "squash\t"+super.toString()+"\t-\t-\t"+altezza+"\t"+piano+"\t"+costo;
    return String.format("%7s ","squash ")+
      super.toString()+
      String.format(" %10s %10s %8.2f %10d %8.2f","","",
        altezza,piano,costo);
  }
=======
public class Squash extends Campo {
    float altezza;
    int piano;

    public Squash(int codice, String nome,
            float larghezza, float lunghezza, float costo,
            float altezza, int piano) {
        super(codice, nome, larghezza, lunghezza, costo);
        this.altezza = altezza;
        this.piano = piano;
    }

    public String toString() {
        return "squash\t" + super.toString() + "\t-\t-\t" + altezza + "\t" + piano + "\t" + costo;
        // return String.format("%7s ","squash ")+
        // super.toString()+
        // String.format(" %4f %10s %10f %10d %5.2f","","",
        // altezza,piano,costo);
    }
>>>>>>> de200cfe75cf0793f8eb753ac9c7d94db29db0f8
}
