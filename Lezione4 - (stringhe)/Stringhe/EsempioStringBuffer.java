public class EsempioStringBuffer {
    public static void main(String[] args) {
        System.out.println("USO DI STRINGBUFFER");
        String originale = "ciao a tutti";
        StringBuffer sb = new StringBuffer(originale);

        char ch;

        for (int i = 0; i < sb.length() / 2; i++) {
            ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length() - i - 1));
            sb.setCharAt(sb.length() - i - 1, ch);
        }
        String invertita = sb.toString();
        System.out.println("Stringa originale: " + originale);
        System.out.println("Stringa invertita con StringBuffer:" + invertita);

    }
}