public class Esempio {
    public static void main(String[] args) {
        int n;
        Counter c1, c2;

        c1 = new Counter();
        c2 = new Counter(5);

        c1.inc();
        n = c1.getValue();
        System.out.print("C1 primo incremento: ");
        System.out.print(n);
        System.out.println();

        c1.inc(3);
        n = c1.getValue();
        System.out.print("C1 secondo incremento: ");
        System.out.print(n);
        System.out.println();

        c2.inc();
        n = c2.getValue();
        System.out.print("C2 primo incremento: ");
        System.out.print(n);
        System.out.println();

        c2.inc(3);
        n = c1.getValue();
        System.out.print("C2 secondo incremento: ");
        System.out.print(n);
        System.out.println();
    }

}
