public class Esercizio1 {
    public static void main (String[] args)
    {
        if(args.length !=2)
        {
            System.out.println("Errore--> Uso tipico: java Esercizio1 <numero1> <numero2>");
            System.exit(1);
        }

        int num1; 
        int num2; 

        num1=Integer.parseInt(args[0]); 
        
        num2=Integer.parseInt(args[1]); 

        CoppiaNumeri coppia= new CoppiaNumeri(num1, num2); 

        System.out.println("Somma tra "+num1 +" e "+ num2+"="+ coppia.somma());
         System.out.println("Prodotto tra "+num1 +" e "+ num2+"="+ coppia.prodotto());


    }
}
