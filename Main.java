import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculo c = new Calculo(0, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int escolha = scanner.nextInt();
        System.out.print("Escolha outro número: ");
        int escolha2 = scanner.nextInt();

        c.n1 = escolha;
        c.n2 = escolha2;

        System.out.println("Escolha a operação:");
        System.out.println("1 - soma");
        System.out.println("2 - subtracao");
        System.out.println("3 - multiplicacao");
        System.out.println("4 - divisao");
        int escolha3 = scanner.nextInt();

        switch (escolha3) {
            case 1:
                System.out.println("soma: " + c.Soma(escolha, escolha2));
                break;
            case 2:
                System.out.println("subtracao: " + c.Subtracao(escolha, escolha2));
                break;
            case 3:
                System.out.println("multiplicacao: " + c.Multiplicacao(escolha, escolha2));
                break;
            case 4:
                System.out.println("divisao: " + c.Divisao(escolha, escolha2));
                break;
        }
    }
}