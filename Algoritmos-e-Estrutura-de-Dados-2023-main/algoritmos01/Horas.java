import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
        //variaveis
        int horas, minutos, segundos, s_final;

        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as horas: ");
        horas = entrada.nextInt();
        System.out.println("Digite os minutos: ");
        minutos = entrada.nextInt();
        System.out.println("Digite os segundos: ");
        segundos = entrada.nextInt();
        entrada.close();

        //processamento
        s_final = horas*3600 + minutos*60 + segundos;
        
        //saida1
        System.out.printf("Em %d horas, %d minutos e %d segundos, há %d segundos", horas,minutos,segundos,s_final);
    }
}

