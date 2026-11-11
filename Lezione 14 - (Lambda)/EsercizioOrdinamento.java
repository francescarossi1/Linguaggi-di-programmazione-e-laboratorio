import java.util.*;

// Definizione della classe Node
class Node {
    private final String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class EsercizioOrdinamento {
    public static void main(String[] args) {
        List<Node> list = Arrays.asList(new Node("c"), new Node("b"), new Node("d"), new Node("a"));

        // Opzione 1: Utilizzando un'espressione Lambda
        Collections.sort(list, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("Lista ordinata (Lambda): " + list);

        // Opzione 2: Utilizzando un Riferimento a Metodo (Method Reference)
        Collections.sort(list, Comparator.comparing(Node::getName));
        System.out.println("Lista ordinata (Method Reference): " + list);
    }
}