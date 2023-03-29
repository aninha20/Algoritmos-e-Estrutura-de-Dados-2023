import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        //variaveis
        String nome;
        int idade;
        float altura;
        //leitura
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = leitura.nextLine();
        System.out.println("Digite sua idade: ");
        idade = leitura.nextInt();
        System.out.println("Digite sua altura em metros:");
        altura = leitura.nextFloat();

        leitura.close();

        //saida
        System.out.printf("Seu nome é %s\nSendo sua idade %d e sua alura %.2f\n", nome,idade,altura);
    }    
}
