import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        //Variavel
        String nome;
        //leitura
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = leitura.nextLine();
        leitura.close();
        //saida
        System.out.printf("Boa dia, %s!\n" , nome);
    }
    
}
