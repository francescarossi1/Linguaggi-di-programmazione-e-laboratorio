import java.util.*;
import java.util.stream.Collectors;

public class EsempioPersone {
    public static void main(String[] args) {
        List<Persona> persone = Arrays.asList(
                new Persona("Mario", "Rossi", 30, Arrays.asList("Calcio", "Musica")),
                new Persona("Luigi", "Verdi", 25, Arrays.asList("Cinema", "Lettura")),
                new Persona("Anna", "Bianchi", 28, Arrays.asList("Viaggi", "Fotografia")));

        // punto 1, 2, 3
        Map<String, List<Persona>> mappa = persone.stream()
                .filter(persona -> persona.getEta() >= 18)
                .sorted(Comparator.comparing(Persona::getEta))
                .collect(Collectors.groupingBy(p -> p.getPassioni().get(0)));

        mappa.forEach((passione, listaPer) -> {
            System.out.println("Passione: " + passione);
            System.out.println("numero persone: " + listaPer.size());
            listaPer.forEach(p -> System.out.println("Nome: " + p.getEta() + " Cognome: " + p.getCognome()));
        });


        // 1. Calcolo età media per ogni passione
        Map<String, Double> etaMediaPerPassione = persone.stream()
                .filter(persona -> persona.getEta() >= 18)
                .collect(Collectors.groupingBy(
                        p -> p.getPassioni().get(0),
                        Collectors.averagingInt(Persona::getEta)
                ));

        // 2. Personalizzazione della stampa
        System.out.println("\n================ RIEPILOGO ELEGANTE ================");
        mappa.forEach((passione, listaPer) -> {
            double media = etaMediaPerPassione.getOrDefault(passione, 0.0);
            
            System.out.printf("PASSIONE: %-12s | Persone: %d | Età media: %.1f anni%n", 
                    passione.toUpperCase(), listaPer.size(), media);
        
            
            listaPer.forEach(p -> 
                System.out.printf("%-10s %-10s (%d anni)%n", 
                        p.getNome(), p.getCognome(), p.getEta())
            );
            System.out.println("====================================================\n");
        });
    }
}