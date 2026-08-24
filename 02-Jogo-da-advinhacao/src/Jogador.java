import java.util.Scanner;

public class Jogador {
    String nome;
    int palpite;

    Scanner leitor = new Scanner(System.in);

    public void adivinhar() {
        System.out.println("Digite o seu palpite: ");
        palpite = leitor.nextInt();
    }
}
