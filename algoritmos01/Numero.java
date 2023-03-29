import java.util.Scanner;

public class Numero{
    public static void main(String[] args) {
        //variaveis
        int valor, potencia;

        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        valor = entrada.nextInt();
        entrada.close();

        //processamento
        potencia = (int)Math.pow(valor,3);
        
        //saida
        System.out.printf("O valor ao cubo do número %d é %d ", valor,potencia);
    }
}