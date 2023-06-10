import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroUsuario;
        int sorte = new Random().nextInt(100);
        int tentivas = 0;

         while (tentivas < 5){

            System.out.println("Tente adivinhar um numero de 1 a 100 em 5 tentativas");
            numeroUsuario = leitura.nextInt();
            tentivas++;

            if (numeroUsuario == sorte) {
                System.out.println("Você acertou o número");
                break;

            } else if (numeroUsuario < sorte) {
                System.out.println("O número sorteado é maior que o digitado");

            } else {
                System.out.println("O número sorteado é menor que o digitado");

            }
            if (tentivas ==5 ) {
                System.out.println("\n Número de tentivas esgotado, tente novamente.");
            }
        }
    }
}





