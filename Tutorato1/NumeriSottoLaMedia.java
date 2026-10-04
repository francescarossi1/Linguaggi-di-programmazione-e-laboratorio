public class NumeriSottoLaMedia {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Errore --> Uso tipico: java NumeriSottolaMedia <num1> <num2> <num3> <num4> <num5>");
            System.exit(1);
        }

        double[] temperature = new double[5];
        double somma = 0;

        for (int i = 0; i < args.length; i++) {
            temperature[i] = Double.parseDouble(args[i]);
            somma += temperature[i];
        }
        double media = somma / temperature.length;

        int contatoreSottoMedia = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] < media) {
                contatoreSottoMedia++;
            }
        }

        System.out.println("Media delle temperature: " + media);
        System.out.println("Numero di temperature sotto la media: " + contatoreSottoMedia);
    }

}
