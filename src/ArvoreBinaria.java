package src;


class TreeNode {
    int valor;
    TreeNode esquerda;
    TreeNode direita;

    public TreeNode(int valor) {
        this.valor = valor;
        esquerda = null;
        direita = null;
    }
}

public class ArvoreBinaria {
    TreeNode raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private TreeNode inserirRecursivo(TreeNode atual, int valor) {
        if (atual == null) {
            return new TreeNode(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }

        // valor já existe
        return atual;
    }

    public void percorrerInOrder() {
        percorrerInOrderRecursivo(raiz);
    }

    private void percorrerInOrderRecursivo(TreeNode node) {
        if (node != null) {
            percorrerInOrderRecursivo(node.esquerda);
            System.out.print(node.valor + " ");
            percorrerInOrderRecursivo(node.direita);
        }
    }

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(2);
        arvore.inserir(7);
        arvore.inserir(12);
        arvore.inserir(18);

        arvore.percorrerInOrder();
    }
}
