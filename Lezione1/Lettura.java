import java.util.Scanner; 

public class Lettura{
    public static void main(String args[])
    {
        int numero; 
        Scanner Lettore= new Scanner(System.in); 

        System.out.print("Inserire numero "); 
        numero=Lettore.nextInt(); 

        System.out.println("Hai inserito il numero: "+ numero);
        Lettore.close();
    }

}