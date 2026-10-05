package Ereditarieta_Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Marco", 40);

        System.out.println("PERSONA");
        System.out.println("Nome " + p1.getNome());
        System.out.println("Età " + p1.getEta());
        p1.presentati();

        Studente s1 = new Studente("Francesca", 10, "Informatica");

        System.out.println("\nSTUDENTE");
        System.out.println("Nome " + s1.getNome());
        System.out.println("Età " + s1.getEta());
        System.out.println("Età " + s1.getCorsoDiLaurea());
        s1.presentati();

        s1.setEta(19);
        s1.setCorsoDiLaurea("Ingegneria Informatica");
        System.out.println("\nDATI MODIFICATI");
        System.out.println("Nome " + s1.getNome());
        System.out.println("Età " + s1.getEta());
        System.out.println("Età " + s1.getCorsoDiLaurea());
        s1.presentati();

    }
}
