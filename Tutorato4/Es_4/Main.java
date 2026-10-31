import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        // Percorsi/Nomi dei file di input e output
        String inputFile = "Purgatorio_Canto28_versi.txt";
        String outputFile = "Purgatorio_Canto28_testo.txt";

        // Try-with-resources: gestisce l'apertura e la chiusura automatica degli stream I/O
        // FileReader/FileWriter leggono/scrivono con codifica UTF-8
        // BufferedReader/BufferedWriter aggiungono un buffer per migliorare le prestazioni
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8)))    
        {
            // Lista temporanea per accumulare i versi fino a un massimo di 3
            List<String> gruppo = new ArrayList<>();
            String line;

            // Legge il file riga per riga finché non raggiunge la fine del file (null)
            while ((line = br.readLine()) != null) 
            {
                // Rimuove eventuali spazi vuoti all'inizio e alla fine della riga
                line = line.trim();
                
                // Salta le righe vuote per evitare di processare spazi non desiderati
                if (!line.isEmpty()) 
                {
                    // Aggiunge la riga valida al gruppo temporaneo
                    gruppo.add(line);

                    // Ogni volta che si accumulano 3 versi (una terzina)
                    if (gruppo.size() == 3) 
                    {
                        // Unisce i 3 versi con uno spazio singolo e li scrive nel file di output
                        bw.write(String.join(" ", gruppo));
                        // Aggiunge un punto di a capo nel file
                        bw.newLine();
                        // Svuota la lista per prepararsi ai successivi 3 versi
                        gruppo.clear();
                    }
                }
            }

            // Gestione dei versi rimanenti: se il totale dei versi non è un multiplo di 3
            // scrive gli ultimi 1 o 2 versi rimasti nella lista
            if (!gruppo.isEmpty()) 
            {
                bw.write(String.join(" ", gruppo));
                bw.newLine();
            }

            System.out.println("File elaborato e salvato con successo in " + outputFile);

        } 
        catch (IOException e) 
        {
            // Gestisce eventuali errori di lettura/scrittura (es. file non trovato o permessi mancanti)
            System.err.println("Errore durante la lettura/scrittura del file: " + e.getMessage());
        }
    }
}