package src;

public class SwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = 3;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
