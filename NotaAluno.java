import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, media;

        System.out.println("Digite seu nome: ");
        nome = sc.next();

        System.out.println("Digite sua nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite outra nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Digite mais uma nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) /2;

        System.out.printf("A média de %s é %.2f", nome, media);

        if (media >= 7.0){
            System.out.println("Parabéns você foi aprovado!");
        }
        else if (media <= 4.0){
            System.out.println("Você foi reprovado!");
        }
        else {
            System.out.println("Você está na final!");
        }
        sc.close();
    }
}
