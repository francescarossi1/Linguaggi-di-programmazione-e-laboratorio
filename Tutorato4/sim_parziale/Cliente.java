import java.util.LinkedList;
import java.util.List;


public class Cliente 
{
    String nome;
    List<Noleggio> noleggio;

    public Cliente( String nome)
    {
       
        this.nome = nome;
        noleggio = new LinkedList<Noleggio>();
    }
    public void addNoleg(String targa, int numero_giorni, double costoGiornaliero){
        noleggio.add(new Noleggio(targa, numero_giorni, costoGiornaliero));
    }

    public double getMassimaSpesa(){

        double massimaSpesa = 0;
        for(Noleggio i:noleggio){
            if(massimaSpesa<i.getSpesa()) massimaSpesa = i.getSpesa();
        }
        return massimaSpesa;
    }

    @Override 
   public String toString(){
        return nome + ", "  + getMassimaSpesa() + ", " + noleggio.size();
    }
}
