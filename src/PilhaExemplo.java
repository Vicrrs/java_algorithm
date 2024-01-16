package src;

import java.util.Stack;

public class PilhaExemplo {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("Item 1");
        pilha.push("Item 2");
        pilha.push("Item 3");

        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
