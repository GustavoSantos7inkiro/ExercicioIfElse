import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Informe a velocidade do carro (em km/h): ");
        double velocidadeCarro = scanner.nextDouble();

        System.out.print("Informe a velocidade máxima permitidade na rua (em km/h): ");
        double velocidadeMaxRua = scanner.nextDouble();

        Double velocidadeAcima = velocidadeCarro - velocidadeMaxRua;


        System.out.println("Dados sobre o carro e o motivo da multa caso tenha");
        System.out.println("A velocidade do carro foi de: " + velocidadeCarro + "km/h");
        System.out.println("A velocidade máxima da rua é de: " + velocidadeMaxRua + "km/h");
        System.out.printf("E a velocidade do carro em comparação a rua foi de : %.2fkm/h %n", velocidadeAcima);

        if(velocidadeAcima <=0) {
            System.out.println("Está dentro da velocidade permitida");
        } else if (velocidadeAcima <= 10) {
            System.out.println("Multa R$ 50,00");
        } else if ( velocidadeAcima <= 30) {
            System.out.println("Multa R$ 100,00");
        } else {
            System.out.println("Multa R$ 300,00");
        }

        scanner.close();
        }

    }
