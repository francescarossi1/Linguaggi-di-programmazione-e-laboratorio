import java.io.*;
import java.util.*;

public class Gestione {
    public static void main(String [] args )
    {
        List <Articolo> articoli=new ArrayList<Articolo>();

        try{

            BufferedReader br=new BufferedReader(new FileReader("articoli.txt")); 
            String line=br.readLine();
            while(line!=null){
                StringTokenizer tok=new StringTokenizer(line);
                int codice=Integer.parseInt(tok.nextToken());
                String tipo=tok.nextToken(); 
                String marca=br.readLine();
                String modello=br.readLine();

                if (tipo.equals("pallone"))
                {
                    line=br.readLine();
                    tok=new StringTokenizer(line); 

                    String taglia=tok.nextToken(); 
                    float prezzo=Float.parseFloat(tok.nextToken());
                    int sconto=Integer.parseInt(tok.nextToken());
                    line=br.readLine();

                    Articolo p=new Pallone(codice, marca, modello, taglia, prezzo, sconto);
                    articoli.add(p);

                }else{
                    line=br.readLine();
                    tok=new StringTokenizer(line); 

                    int peso=Integer.parseInt(tok.nextToken());
                    float prezzo=Float.parseFloat(tok.nextToken());
                    int sconto=Integer.parseInt(tok.nextToken());
                    line=br.readLine();

                    Articolo r=new Racchetta(codice, marca, modello, peso, prezzo, sconto);
                    articoli.add(r);
                    
                }
                line=br.readLine();
            }
            br.close();

        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(String.format("%10s %6s %15s %15s %6s %6s %8s %6s",
    "Tipo", "Codice", "Marca", "Modello", "Taglia", "Peso", "Prezzo", "Sconto"));
        for(Articolo a: articoli)
        {
            System.out.println(a);
        }
    }
}
