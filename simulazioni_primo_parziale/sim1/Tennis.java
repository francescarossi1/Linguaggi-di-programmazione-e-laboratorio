public class Tennis extends Campo {
  float temp;
  String terreno;

  public Tennis(int codice, String nome, 
    float larghezza, float lunghezza, float costo,
    float temp, String terreno)
  {
    super(codice,nome,larghezza,lunghezza,costo);
    this.temp=temp;
    this.terreno=terreno;
  }
  
  public String toString()
  {
    //return "tennis\t"+super.toString()+"\t"+temp+"\t"+terreno+"\t-\t-\t"+costo;
    //return super.toString();
    //   String.format(" %4f %10s %10s %10s %5.2f",temp,terreno," "," ",costo);

     return String.format("%7s ","tennis ")+super.toString()+
     String.format(" %8.2f %10s %10s %10s %8.2f",temp,terreno," "," ",costo);
  }

  
}
