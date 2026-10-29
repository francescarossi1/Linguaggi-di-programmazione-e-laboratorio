import java.io.BufferedReader;
import java.io.FileReader;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Veicolo> veicoli = new ArrayList<Veicolo>();
        List<Cliente> clienti = new ArrayList<Cliente>();

        Map<Integer, String> codTarga = new HashMap<Integer, String>();
        Map<Integer, Double> codCosto = new HashMap<Integer, Double>(); // costo per ogni veicolo
        Map<Integer, Double> codTotale = new HashMap<Integer, Double>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("veicoli.txt"));
            String linea = reader.readLine();
            while (linea != null) {
               StringTokenizer riga = new StringTokenizer(linea);

                int codice = Integer.parseInt(riga.nextToken()); 
                String tipo = riga.nextToken();                  
                String targa = riga.nextToken();                

                String modello = reader.readLine();
                String marca = reader.readLine();

                if (tipo.equals("auto")) {
                    riga = new StringTokenizer(reader.readLine());

                    int cilindrata = Integer.parseInt(riga.nextToken());
                    double bagagliaio = Double.parseDouble(riga.nextToken());
                    double costo = Double.parseDouble(reader.readLine());

                    Auto auto = new Auto(codice, targa, modello, marca, costo, cilindrata, bagagliaio);
                    veicoli.add(auto);

                    codTarga.put(codice, targa);
                    codCosto.put(codice, costo);
                    codTotale.put(codice, 0.0); // contatore inizializzato a 0 che verrà incrementato

                } else {
                    String categoria = reader.readLine();

                    riga = new StringTokenizer(reader.readLine());
                    int posti = Integer.parseInt(riga.nextToken());
                    boolean vano = Boolean.parseBoolean(riga.nextToken());
                    double costo = Double.parseDouble(reader.readLine());

                    Furgone furgone = new Furgone(codice, targa, modello, marca, costo, categoria, posti, vano);
                    veicoli.add(furgone);

                    codTarga.put(codice, targa);
                    codCosto.put(codice, costo);
                    codTotale.put(codice, 0.0); // contatore inizializzato a 0 che verrà incrementato

                }
                linea = reader.readLine();

            }
            reader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("clienti.txt"));
            String linea = reader.readLine();
            while (linea != null) {
                String nomeCognome = linea;
                Cliente cliente = new Cliente(nomeCognome);
                clienti.add(cliente);

                // più informazioni sullo stessa riga

                StringTokenizer riga = new StringTokenizer(reader.readLine());
                while (riga.hasMoreTokens()) {
                    int codice = Integer.parseInt(riga.nextToken());
                    int giorni = Integer.parseInt(riga.nextToken());

                    String targa = codTarga.get(codice);
                    double costo = codCosto.get(codice);

                    cliente.addNoleggio(targa, giorni, costo);

                    double temp = codTotale.get(codice); // valore 0.0
                    codTotale.put(codice, temp + giorni * costo); // giorni * costo del noleggio
                }
                linea = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("tipo,targa, codice, modello, marca, costo giornaliero, cilindrata, bagagliaio, categoria, numero posti, vano di carico");
        for (Veicolo v: veicoli)
        {
            System.out.println(v); 
        }

        for(Cliente c: clienti)
        {
             System.out.println(c); 
        }

        System.out.println("\n\n"); 
        int codice=Integer.parseInt(args[0]);
        System.out.println(codice+"\t"+codTotale.get(codice));
       
    }
}
