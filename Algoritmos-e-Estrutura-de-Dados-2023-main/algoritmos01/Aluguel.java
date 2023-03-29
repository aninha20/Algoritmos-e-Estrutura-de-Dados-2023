import java.util.Scanner;

public class Aluguel {
    public static void main(String[] args) {
        //variaveis
        float km, valor_final;
        int dias;
        //leitura
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva a quantidade de Km rodados: ");
        km = leitura.nextFloat();
        System.out.println("Digite a quantidade de dias em que o carro esteve em sua posse: ");
        dias = leitura.nextInt();
        leitura.close();
        //processamento
        valor_final = (float)(km*0.15 + dias*60);
        //saida
        System.out.printf("O preço que você deverá pagar pelo aluguel é %.2f\n", valor_final);
    }
}
