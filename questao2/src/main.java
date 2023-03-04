import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int numero1 = 0;
        int numero2 = 1;
        int temp;
        Scanner leitor = new Scanner(System.in);
        int procurado = leitor.nextInt();
        while (true) {
            temp = numero2;
            numero2 += numero1;
            numero1 = temp;

            if (numero2 == procurado) {
                System.out.println("Pertence a sequencia de Fibonacci");
                break;
            } else if (numero2 > procurado) {
                System.out.println("Não pertence a sequencia de Fibonacci");
                break;
            }
        }
    }
}
