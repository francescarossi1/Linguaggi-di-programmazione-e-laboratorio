import java.io.*;
import java.util.*;

public class Gestione {
  
  public static void main(String[] args) {
    List<Campo> campi= new ArrayList<Campo>();
    List<Socio> soci= new ArrayList<Socio>();
    Map<Integer,Campo> codiciCampo = new HashMap<Integer,Campo>();

    try{
      BufferedReader bf=new BufferedReader(new FileReader("campi.txt"));

      String line=bf.readLine();
      while (line!=null)
      {
        StringTokenizer tok=new StringTokenizer(line);
        int codice=Integer.parseInt(tok.nextToken());
        String tipo=tok.nextToken();
        String nome=bf.readLine();
        line=bf.readLine();
        tok=new StringTokenizer(line);
        float larghezza= Float.parseFloat(tok.nextToken());
        float lunghezza= Float.parseFloat(tok.nextToken());

        if (tipo.equals("tennis"))
        {
          float temp=Float.parseFloat(tok.nextToken());
          String terreno=bf.readLine();
          float costo=Float.parseFloat(bf.readLine());
          Campo c= new Tennis(codice, nome, 
            larghezza, lunghezza, costo, temp, terreno);
          campi.add(c);
          codiciCampo.put(codice,c);
        }
        else
        {
          float altezza=Float.parseFloat(tok.nextToken());
          int piano=Integer.parseInt(tok.nextToken());
          float costo=Float.parseFloat(tok.nextToken());
          Campo c= new Squash(codice, nome, larghezza, 
            lunghezza, costo, altezza, piano);
          campi.add(c);
          codiciCampo.put(codice,c);
        }
        line=bf.readLine();

      }
      bf.close();
    }
    catch (Exception ex)
    {
      System.out.println(ex);
    }
    for (Campo c : campi)
      System.out.println(c);

    try
    {
      BufferedReader br= new BufferedReader(new FileReader("soci.txt"));
      String line=br.readLine();
      while (line!=null)
      {
        int codice = Integer.parseInt(line);
        String nome= br.readLine();
        line = br.readLine();
        StringTokenizer tok= new StringTokenizer(line);
        int età=Integer.parseInt(tok.nextToken());
        int categoria=Integer.parseInt(tok.nextToken());
        Socio s= new Socio(codice, età, categoria, nome);
        soci.add(s);
        line=br.readLine();
        tok= new StringTokenizer(line);
        while (tok.hasMoreTokens())
        {
          int codice_campo= Integer.parseInt(tok.nextToken());
          int ora=Integer.parseInt(tok.nextToken());
          Prenotazione p= new Prenotazione(codice_campo, ora);
          s.addPren(p);

          codiciCampo.get(p.getCodice()).addPren();
        }
        line=br.readLine();
      }
      br.close();
    }
    catch (Exception ex)
    {
      System.out.println(ex);
    }
    for (Socio s: soci)
      System.out.println(s);   
    
    // Punto 5
    int codCampo = Integer.parseInt(args[0]);
    System.out.println("\n" + codiciCampo.get(codCampo).getIncasso());

  }
}
