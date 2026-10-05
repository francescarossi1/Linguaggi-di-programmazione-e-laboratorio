package EsAlieni;

public class Main {
    public static void main(String[] args) {
        Serpente s1 = new Serpente("SHH", 100);
        Orco o1 = new Orco("Winnie", 2);
        Marshmallow m1 = new Marshmallow("MH", 20);

        Serpente s2 = new Serpente("FHH", 50);
        Orco o2 = new Orco("Marghe", 70);
        Marshmallow m2 = new Marshmallow("GNN", 30);

        GruppoAlieni ga = new GruppoAlieni(6);
        ga.AddAlieno(s1, 0);
        ga.AddAlieno(o1, 1);
        ga.AddAlieno(m1, 2);
        ga.AddAlieno(s2, 3);
        ga.AddAlieno(o2, 4);
        ga.AddAlieno(m2, 5);
        System.out.println("Danno: " + ga.GetDannoTotale());
    }
}
