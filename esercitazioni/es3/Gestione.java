import java.util.*;
import java.io.*;

public class Gestione {
    public static void main(String[] args) {
        List<Campo> campi = new ArrayList<Campo>();

        List<Socio> soci = new ArrayList<Socio>();

        Map<Integer, Campo> codCampo = new HashMap<Integer, Campo>();

        try {

            BufferedReader bf = new BufferedReader(new FileReader("campi.txt"));
            String line = bf.readLine();

            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line);
                int codice = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String nome = bf.readLine();
                line = bf.readLine();
                tok = new StringTokenizer(line);
                float larghezza = Float.parseFloat(tok.nextToken());
                float lunghezza = Float.parseFloat(tok.nextToken());
                if (tipo.equals("tennis")) {
                    float temperatura = Float.parseFloat(tok.nextToken());
                    String terreno = bf.readLine();
                    float costo = Float.parseFloat(bf.readLine());

                    Campo c = new Tennis(codice, nome, larghezza, lunghezza, costo, temperatura, terreno);
                    campi.add(c);

                    codCampo.put(codice, c);

                } else {
                    float altezza = Float.parseFloat(tok.nextToken());
                    int piano = Integer.parseInt(tok.nextToken());
                    float costo = Float.parseFloat(tok.nextToken());

                    Campo s = new Squash(codice, nome, larghezza, lunghezza, costo, altezza, piano);
                    campi.add(s);

                    codCampo.put(codice, s);
                }
                line = bf.readLine();
            }
            bf.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(
                "sport, nome del campo, codice, larghezza, lunghezza, temperatura, terreno, altezza, piano, costo");
        for (Campo c : campi) {
            System.out.println(c);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("soci.txt"));
            String line = br.readLine();
            while (line != null) {
                int codice = Integer.parseInt(line);
                String nome_cognome = br.readLine();
                line = br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                int eta = Integer.parseInt(tok.nextToken());
                int categoria = Integer.parseInt(tok.nextToken());

                Socio s = new Socio(codice, nome_cognome, eta, categoria);
                soci.add(s);
                line = br.readLine();
                tok = new StringTokenizer(line);

                while (tok.hasMoreTokens()) {
                    int codice_campo = Integer.parseInt(tok.nextToken());
                    int ora_campo = Integer.parseInt(tok.nextToken());
                    s.addPrenotazione(new Prenotazione(codice_campo, ora_campo));
                    Campo c = codCampo.get(codice_campo);
                    c.addPrenotazione();
                }
                line = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("codice, nome e cognome, età, categoria, prenotazioni");
        for (Socio s : soci) {
            System.out.println(s);
        }

        // PUNTO 5: stampe dell'incasso di un campo
        int cod = Integer.parseInt(args[0]);

        System.out.println(codCampo.get(cod).incasso());
    }
}