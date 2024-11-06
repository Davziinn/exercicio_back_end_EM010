import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;

        for(int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();
            soma += nota;
        }

        double media = soma / 4;
        System.out.println("Sua média foi: " + media);

        if (media >= 7) {
            System.out.println("PARÁBENS, VOCÊ FOI APROVADO!!");
        } else if (media >= 5) {
            System.out.println("POR POUCO! VOCÊ ESTÁ DE RECUPERAÇÃO.");
        } else {
            System.out.println("INFELIZMENTE, VOCÊ FOI REPROVADO!");
        }
        sc.close();
    }
}