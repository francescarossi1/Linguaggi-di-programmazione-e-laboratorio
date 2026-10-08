import java.util.Scanner;

public class LunghezzaStringa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1, s2;

        System.out.println("Inserire la prima stringa");
        s1 = scan.nextLine().trim();

        System.out.println("Inserire la seconda stringa");
        s2 = scan.nextLine().trim();

        System.out.println("La stringa " + s1 + " ha " + s1.length() + " caratteri ");
        System.out.println("La stringa " + s2 + " ha " + s2.length() + " caratteri ");

        String s3 = s1 + "" + s2;
        System.out.println("La stringa " + s3 + " ha " + s3.length() + " caratteri ");
        
        scan.close();
    }
}
