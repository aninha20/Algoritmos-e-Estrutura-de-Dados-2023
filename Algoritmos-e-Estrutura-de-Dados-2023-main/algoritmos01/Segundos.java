import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) {
        //variaveis
        int segundos, h_final, horas;

        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os segundos: ");
        segundos = entrada.nextInt();
        entrada.close();

        //processamento
        horas = segundos/3600;
        h_final = segundos%3600;
        h_final = h_final%60;

        //saida
        System.out.printf("Em %d segundos, há %d hora, %d minutos, %d segundos\n", segundos,horas, h_final, segundos);
    }
}
