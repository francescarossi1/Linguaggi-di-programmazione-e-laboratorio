import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Gestione {
    public static void main(String[] args) {
        List<Dipendente> ld = new ArrayList<Dipendente>();
        List<Cliente> clienti = new ArrayList<Cliente>();

        Map<Integer, Dipendente> codDip = new HashMap<Integer, Dipendente>();

        Map<Dipendente, Integer> dipNServ = new HashMap<Dipendente, Integer>();

        try {

            BufferedReader br = new BufferedReader(new FileReader("dipendenti.txt"));
            String line = br.readLine();

            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line);
                int codice = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String nome = br.readLine(); // riga intera

                if (tipo.equals("trainer")) {
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    int ore = Integer.parseInt(tok.nextToken());
                    double costo = Double.parseDouble(tok.nextToken());
                    String specialita = br.readLine();

                    Trainer t = new Trainer(codice, nome, costo, ore, specialita);
                    ld.add(t);

                    codDip.put(codice, t);

                    dipNServ.put(t, 0);
                } else {
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    int telefono = Integer.parseInt(tok.nextToken());
                    boolean medico = Boolean.parseBoolean(tok.nextToken());
                    int app_sett = Integer.parseInt(tok.nextToken());

                    Nutrizionista n = new Nutrizionista(codice, nome, codice, telefono, medico, app_sett);
                    ld.add(n);

                    codDip.put(codice, n);

                    dipNServ.put(n, 0);

                }
                line = br.readLine();

            }
            br.close();

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

        for (Dipendente d : ld) {
            System.out.println(d);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line = br.readLine();

            while (line != null) {
                int codice = Integer.parseInt(line);
                String nome = br.readLine();
                Cliente c = new Cliente(codice, nome);
                clienti.add(c);

                line = br.readLine(); // legge prossima riga

                while (line != null & !line.equals("")) {
                    StringTokenizer tok = new StringTokenizer(line);
                    int cod_dip = Integer.parseInt(tok.nextToken());
                    double ore = Double.parseDouble(tok.nextToken());

                    Dipendente d = codDip.get(cod_dip); // associa il dipendente alla mappa

                    Servizio s = new Servizio(ore, d);
                    c.addServizio(s);

                    line = br.readLine();

                    // punto 5
                    int servizi = dipNServ.get(d);
                    dipNServ.put(d, servizi + 1);
                }
                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

        for (Cliente c : clienti) {
            System.out.println(c);
        }

        // punto 5
        int s_max = 0;
        String nome_max = "";
        for (Dipendente d : ld) {
            int n_serv = dipNServ.get(d);
            if (n_serv > s_max) {
                s_max = n_serv;
                nome_max = d.getNome();
            }
        }

        System.out.println(nome_max + " " + s_max);

    }
}
