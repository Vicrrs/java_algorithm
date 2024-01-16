package src;
import java.util.Arrays;

public class OrdenacaoArray {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 3, 8};
        Arrays.sort(numeros);

        for (int numero : numeros) {
            System.out.println(numero + " ");
        }

    }
}
