import java.util.Scanner;


public class Raiz {
    public static void main(String[] args) {
        //variáveis
        int valor, raiz_cubica, raiz_quadrada; 
        //leitura
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        valor = leitura.nextInt();
        leitura.close();
        //processamento
        raiz_quadrada = (int)Math.sqrt(valor);
        raiz_cubica = (int)Math.cbrt(valor);
        //saida
        System.out.printf("A raiz quadrada do número %d é %d e sua raiz cúbica é %d\n", valor, raiz_quadrada, raiz_cubica);
        }
    }

