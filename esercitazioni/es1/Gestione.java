import java.io.*;
import java.util.*;

public class Gestione {
    public static void main(String[] args) {
        List<Articolo> articoli = new ArrayList<Articolo>();

        List<Negozio> negozi = new ArrayList<Negozio>();

        Map<Integer, Articolo> codiciArticolo = new HashMap<Integer, Articolo>();

        try {

            BufferedReader br = new BufferedReader(new FileReader("articoli.txt"));
            String line = br.readLine();
            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line);
                int codice = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String marca = br.readLine();
                String modello = br.readLine();

                if (tipo.equals("pallone")) {
                    line = br.readLine();
                    tok = new StringTokenizer(line);

                    String taglia = tok.nextToken();
                    float prezzo = Float.parseFloat(tok.nextToken());
                    int sconto = Integer.parseInt(tok.nextToken());
                    line = br.readLine();

                    Articolo p = new Pallone(codice, marca, modello, taglia, prezzo, sconto);
                    articoli.add(p);

                    codiciArticolo.put(codice, p); // punto 5
                } else {
                    line = br.readLine();
                    tok = new StringTokenizer(line);

                    int peso = Integer.parseInt(tok.nextToken());
                    float prezzo = Float.parseFloat(tok.nextToken());
                    int sconto = Integer.parseInt(tok.nextToken());
                    line = br.readLine();

                    Articolo r = new Racchetta(codice, marca, modello, peso, prezzo, sconto);
                    articoli.add(r);

                    codiciArticolo.put(codice, r); // punto 5

                }
                line = br.readLine();
            }
            br.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(String.format("%10s %6s %15s %15s %6s %6s %8s %6s",
                "Tipo", "Codice", "Marca", "Modello", "Taglia", "Peso", "Prezzo", "Sconto"));
        for (Articolo a : articoli) {
            System.out.println(a);
        }

        // punto 4
        try {
            BufferedReader br = new BufferedReader(new FileReader("negozi.txt"));
            String line = br.readLine();
            while (line != null) {

                int codice = Integer.parseInt(line.trim());
                String nome = br.readLine();
                String indirizzo = br.readLine();
                Negozio n = new Negozio(codice, nome, indirizzo);
                negozi.add(n);

                line = br.readLine(); // riga del magazzino
                StringTokenizer tok = new StringTokenizer(line);
                while (tok.hasMoreTokens()) {
                    int codiceArticolo = Integer.parseInt(tok.nextToken());
                    int quantita = Integer.parseInt(tok.nextToken());
                    n.addArticolo(codiceArticolo, quantita);
                }
                line = br.readLine(); // codice del negozio successivo
            }
            br.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("\nElenco Negozi:");
        System.out.println(Negozio.intestazione());
        for (Negozio n : negozi)
            System.out.println(n);

        // Punto 5
        if (args.length < 1) {
            System.out.println("Uso: java Gestione <codice articolo>");
            return;
        }

        int codArticolo = Integer.parseInt(args[0]);
        Articolo a = codiciArticolo.get(codArticolo);

        if (a == null) {
            System.out.println("Articolo " + codArticolo + " non trovato");
        } else {
            int totale = 0;
            for (Negozio n : negozi)
                totale += n.getQuantita(codArticolo);

            float valore = totale * a.getPrezzo();
            valore = Math.round(valore * 100) / 100f; // arrotonda a 2 decimali
            System.out.println(a.getMarca() + " " + a.getModello() + " " + valore);
        }
    }
}
