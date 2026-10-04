public class Wrapper {
    public static void main(String[] args) {
        int x = 35;
        Integer ix = new Integer(x);
        x = 2 * ix.intValue();

        System.out.println("ix= " + ix.toString());
        System.out.println("x= " + Integer.toString(x));

        Integer in = new Integer("23");
        int n1 = in.intValue();

        int n2 = Integer.parseInt("23");

    }
}