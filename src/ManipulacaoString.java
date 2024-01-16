package src;

public class ManipulacaoString {
    public static void main(String[] args) {
        String texto = "Java é divertido!";

        // Tamanho da String
        int tamanho =  texto.length();

        // Transformar em maiúscula
        String maiuscula = texto.toUpperCase();

        // Substituir parte da string
        String substituta = texto.replace("divertido", "incrivel");

        System.out.println("Tamanho: " + tamanho);
        System.out.println("Maiuscula: " + maiuscula);
        System.out.println("Substituta: " + substituta);
    }
}
