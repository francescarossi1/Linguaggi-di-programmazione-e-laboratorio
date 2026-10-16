public class Convertitore{
    public Convertitore(String[] args) throws NumberFormatException, IllegalArgumentException{
        int numero = Integer.parseInt(args[0]);

        if((numero < -10) || (numero > 10)){
            throw new IllegalArgumentException("Fuori dall'intervallo");
        }
        System.out.println("Numero: " + numero);
    }
}