public class Concatenazione {
    public static void main(String[] args) {
        System.out.println("COSTANTI STRINGA E CONCATENAZIONE");
        String s = "ciao";
        System.out.println("Stringa iniziale: " + s);

        s = s + "a tutti";
        System.out.println("Stringa concatenata: " + s);

        System.out.println("\n CONCATENAZIONE CON TIPI PRIMITIVI");
        String sNum = "Numero " + 5.7;
        System.out.println(sNum);
        int n = 10;
        String sNum2 = "" + n;
        System.out.println("Numero convertito in stringa " + sNum2);
    }

}
