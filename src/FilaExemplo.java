package src;
import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Item 1");
        fila.add("Item 2");
        fila.add("Item 3");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
