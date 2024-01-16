package src;

public class BuscaBinaria {
    public static int buscaBinaria(int[] arr, int alvo) {
        int esquerda = 0;
        int direita = arr.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (arr[meio] == alvo) {
                return meio;
            } else if (arr[meio] < alvo) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }
}

