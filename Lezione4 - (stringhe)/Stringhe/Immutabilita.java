public class Immutabilita {
    public static void main(String[] args) {
        String s = "ciao a tutti";

        System.out.println("\n IMMUTABILITA' E METODI DELLA CLASSE STRING");

        String s_sostituita = s.replace('t', 'p');
        System.out.println("Risultato di replace: " + s_sostituita);
        System.out.println("La stringa originale è rimasta immutata: " + s);

        System.out.println("Lunghezza stringa: " + s.length());

        System.out.println("Carattere in posione 5 (charAt): " + s.charAt(5));

        System.out.println("Indice della prima a (indexOf): " + s.indexOf('a'));

        String sottostringa = s.substring(5, 12);
        System.out.println("Sottostringa da 5 a 11 (substring): '" + sottostringa + "'");

    }
}
