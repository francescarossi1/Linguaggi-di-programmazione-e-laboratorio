public class Main {
    public static void main(String[] args) {
        Paziente p1 = new Paziente("Franco Peppi","32kdsh29");
        Paziente p2 = new Paziente("Mauro Bressi","27mklk78");
        Dottore d1 = new Dottore("Franco Milani","Pediatra",120.4);
        Dottore d2 = new Dottore("Giuseppe Negri","Chirurgo",150.5);

        Fattura f1 = new Fattura(d1, p1);
        Fattura f2 = new Fattura(d2, p2);

        System.out.println("Fattura di " + f1.getNomePaziente() + " del medico " + f1.getNomeDottore() + " con importo " + f1.getImporto());
        System.out.println("Fattura di " + f2.getNomePaziente() + " del medico " + f2.getNomeDottore() + " con importo " + f2.getImporto());
        
        System.out.println("Totale importo fatture: " + (f1.getImporto() + f2.getImporto()));
    }
}
