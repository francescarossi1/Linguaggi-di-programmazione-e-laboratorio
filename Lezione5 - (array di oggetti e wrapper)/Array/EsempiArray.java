public class EsempiArray {
    public static void main(String[] args) {
        int[] a;
        a = new int[50];

        a[5] = 18;
        System.out.println(a[5]);

        int n = a[7];
        System.out.println(n);

        System.out.println(n = a.length);
    }
}