/*
public class Esempio 
{
    public static void main(String[] args) 
    {
        int n;
        Counter c1;
        c1 = new Counter();
        c1.reset();
        c1.inc();
        n = c1.getValue();
        System.out.println(n);
    }
}
*/

public class Esempio 
{
    public static void main(String[] args) 
    {
        int n;
        Counter c1; 
        Counter c2; 
        Counter c3; 
        boolean b1;
        boolean b2;

        c1 = new Counter();
        c2 = new Counter();
        c3= new Counter();
        
        c1.inc();
        b1 = c1.equals(c2); /* b1 vale false */
        n = c1.getValue();
        System.out.println(b1);
        
        c1.copy(c2); 
        b2=c1.equals(c2); 
        System.out.println(b2);

        n=c1.getValue();
        System.out.println(n);

        n=c2.getValue();
        System.out.println(n);

        c3.reset();
        c3.inc();
        c3.inc();
        n=c3.getValue();
        System.out.println(n);
        c3.dec();
        n=c3.getValue();
        System.out.println(n);
    }
}