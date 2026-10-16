public class Main {
    public static void main(String[] args) {
        try{
            Convertitore conv = new Convertitore(args);
        } catch (NumberFormatException e1){
            System.err.println("Format Exception 1: " + e1.getMessage()); // messaggio predefinito
        } catch (IllegalArgumentException e2){
            System.err.println("Format Exception 2: " + e2.getMessage()); // messaggio definito in Convertitore
        }
    }
}
