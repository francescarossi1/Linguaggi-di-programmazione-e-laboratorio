public class CalcolaDemo {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1. Implementazione Somma via Lambda
        Calcola somma = array -> {
            int totale = 0;
            for (int val : array) {
                totale += val;
            }
            return totale;
        };

        // 2. Implementazione Massimo via Lambda
        Calcola massimo = array -> {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        };

        // 3. Implementazione Minimo via Lambda
        Calcola minimo = array -> {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        };

        // Esecuzione e Stampa dei Risultati
        int risultatoSomma = somma.calcola(numeri);
        int media = risultatoSomma / numeri.length;
        int max = massimo.calcola(numeri);
        int min = minimo.calcola(numeri);

        System.out.println("Somma: " + risultatoSomma);
        System.out.println("Media: " + media);
        System.out.println("Massimo: " + max);
        System.out.println("Minimo: " + min);
    }
}