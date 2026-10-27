import java.io.*;
import java.util.*;

public class Gestione {
    public static void main(String[] args) {
        List<Progetto> progetti = new ArrayList<Progetto>();
        List<Ricercatore> ricercatori = new ArrayList<Ricercatore>();
        Map<Integer, Progetto> codiceProgetto = new HashMap<Integer, Progetto>();
        String inserimento_cognome = args[0]; // punto 5

        try {
            BufferedReader br = new BufferedReader(new FileReader("progetti.txt"));
            String line = br.readLine(); //
            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line); //
                int codice = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String titolo = br.readLine();
                String nome = br.readLine();
                String organizzatore = br.readLine();

                if (tipo.equals("ricerca")) {
                    line = br.readLine();
                    tok = new StringTokenizer(line);

                    String codice_argomento = tok.nextToken();
                    int num_partner = Integer.parseInt(tok.nextToken());
                    double importo_tot = Double.parseDouble(br.readLine());

                    Progetto p = new Ricerca(codice, titolo, nome, organizzatore, importo_tot, codice_argomento,
                            num_partner);
                    progetti.add(p);
                    codiceProgetto.put(codice, p);

                } else {
                    line = br.readLine();
                    tok = new StringTokenizer(line);

                    int num_aziende = Integer.parseInt(tok.nextToken());
                    double importo_tot = Double.parseDouble(tok.nextToken());

                    Progetto i = new Innovazione(codice, titolo, nome, organizzatore, importo_tot, num_aziende);
                    progetti.add(i);
                    codiceProgetto.put(codice, i);

                }
                line = br.readLine(); //

            }
            br.close();
        } catch (Exception e) //
        {
            System.out.println(e.getMessage());
        }

        System.out
                .println("tipo, titolo, codice, coordinatore, organizzazione, argomento, partner, aziende, importo\n" + //
                        "totale in migliaia di euro");

        for (Progetto pr : progetti) {
            System.out.println(pr);
        }

        // punto 4

        try {
            BufferedReader br = new BufferedReader(new FileReader("ricercatori.txt"));
            String line = br.readLine();
            while (line != null) {
                String nome = line;
                String cognome = br.readLine();
                Ricercatore r = new Ricercatore(nome, cognome);
                ricercatori.add(r);
                line = br.readLine();
                while (line != null && !line.equals("")) {
                    StringTokenizer tok = new StringTokenizer(line);
                     int codice = Integer.parseInt(tok.nextToken());
                    double ore = Double.parseDouble(tok.nextToken());
                    r.addProgetto(codiceProgetto.get(codice), ore);
                    line = br.readLine();
                }
                line = br.readLine();
            }
            br.close();
        } catch (Exception e) //
        {
            System.out.println(e.getMessage());
        }

        for (Ricercatore r : ricercatori) {
            System.out.println(r);
        }

        // punto 5
        for (Ricercatore r : ricercatori) {
            if (r.getCognome().equals(inserimento_cognome)) {
                Impegno i = r.getMax();
                System.out.println(
                        r.getNome() + " " + r.getCognome() + " " + i.getOre() + " " + i.getProgetto().getTitolo());
            }
        }
    }
}
