import java.io.*;
import java.util.*;

public class Gestione {

    public static void main(String[] args) {
        List<Veicolo> veicoli = new LinkedList<Veicolo>();
        List<Cliente> clienti = new LinkedList<Cliente>();
        Map<String, Integer> targaNoleggio = new HashMap<String, Integer>();
        Map<Integer, String> codiciTarga = new HashMap<Integer, String>();
        Map<Integer, Double> codiciCosto = new HashMap<Integer, Double>();
        
        //1 e 3. (6 pt)
        try {
            BufferedReader reader = new BufferedReader(new FileReader("veicoli.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                StringTokenizer riga = new StringTokenizer(linea);

                int codice = Integer.parseInt(riga.nextToken());
                String tipo = riga.nextToken();
                String targa = riga.nextToken();

                String modello = reader.readLine();
                String marca = reader.readLine();

                if (tipo.equals("auto")) {
                    linea = reader.readLine();
                    riga = new StringTokenizer(linea);

                    double capienza = Double.parseDouble(riga.nextToken());
                    int cilindrata = Integer.parseInt(riga.nextToken());
                    String categoria = reader.readLine();

                    double costoGiornaliero = Double.parseDouble(reader.readLine());

                    Veicolo v_temp = new Auto(codice, targa, modello, marca, capienza, cilindrata, categoria,
                            costoGiornaliero);
                    veicoli.add(v_temp);

                    codiciCosto.put(codice, costoGiornaliero);
                    codiciTarga.put(codice, targa);
                } else {
                    linea = reader.readLine();
                    riga = new StringTokenizer(linea);

                    boolean rimorchio = Boolean.parseBoolean(riga.nextToken());
                    int numeroposti = Integer.parseInt(riga.nextToken());
                    boolean vanodicarico = Boolean.parseBoolean(riga.nextToken());
                    double costoGiornaliero = Double.parseDouble(reader.readLine());

                    Veicolo f_temp = new Furgone(codice, targa, modello, marca, rimorchio, numeroposti, vanodicarico,
                            costoGiornaliero);
                    veicoli.add(f_temp);

                    codiciCosto.put(codice, costoGiornaliero);
                    codiciTarga.put(codice, targa);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println(
                "tipo, targa, codice, modello, marca, costo giornaliero, bagagliaio, cilindrata, categoria, rimorchio, numero di posti, vano di carico");
        for (Veicolo i : veicoli) {
            System.out.println(i);
        }

        // 2 e 4.
        try {
            BufferedReader reader = new BufferedReader(new FileReader("clienti.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                String nome_cognome = linea;
                Cliente c_temp = new Cliente(nome_cognome);
                clienti.add(c_temp);
                linea = reader.readLine();
                while (linea != null && !linea.equals("")) {
                    StringTokenizer riga = new StringTokenizer(linea);
                    int codice = Integer.parseInt(riga.nextToken());
                    int numero_giorni = Integer.parseInt(riga.nextToken());
                    String targa = codiciTarga.get(codice);
                    Double costo_giornaliero = codiciCosto.get(codice);

                    c_temp.addNoleg(targa, numero_giorni, costo_giornaliero);

                    Integer noleggi = targaNoleggio.get(targa);

                    if (noleggi == null) {
                        targaNoleggio.put(targa, 1);
                    } else {
                        targaNoleggio.put(targa, noleggi + 1);
                    }
                    linea = reader.readLine();
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println();

        for (Cliente i : clienti) {
            System.out.println(i);
        }

        System.out.println();

        // 5.
        Scanner scan = new Scanner(System.in);
        String targa = scan.nextLine();

        scan.close();

        int num = targaNoleggio.get(targa);
        System.out.println(num);

    }
}
