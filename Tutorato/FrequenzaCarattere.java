public class FrequenzaCarattere {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Errore --> Uso tipico: java FrequenzaCarattere <numero>");
            System.exit(1);
        }

        String numero = args[0];

        if (numero.length() != 10 || !numero.matches("\\d{10}")) {
            System.out.println("Errore: Inserire un numero di telefono valido composto da esattamente 10 cifre.");
            System.exit(1);
        }

        int[] frequenza = new int[10];

        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            int cifra = Character.getNumericValue(c); /
            frequenza[cifra]++;
        }

        System.out.println("Frequenza delle cifre nel numero " + numero + ":");
        for (int i = 0; i < frequenza.length; i++) {
            System.out.println("Cifra " + i + ": " + frequenza[i] + " volt" + (frequenza[i] == 1 ? "a" : "e"));
        }
    }
}