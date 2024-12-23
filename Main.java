import java.util.Scanner;

public class Main {
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoDesejada;

        while (true){
            System.out.println("Digite a opção desejada:");
            System.out.println("1- Digite 1 para converter de Celsius para Fahrenheit;");
            System.out.println("2- Digite 2 para converter de Fahrenheit para Celsius;");
            System.out.println("3- Digite 3 para sair;");

           opcaoDesejada = scanner.nextInt();

            if (opcaoDesejada == 3){
                System.out.println("Encerrando o programa. Até mais!");
                break;
            } else if (opcaoDesejada == 1){
                System.out.println("Digite a temperatura em Celsius que você deseja converter para Fahrenheit:");
                double temperaturaDesejada = scanner.nextDouble();
                double c = celsiusParaFahrenheit(temperaturaDesejada);
                System.out.println("A conversão de " + temperaturaDesejada + " graus Celsius para graus Fahrenheit resulta em: " + c + " graus Fahrenheit.");
            } else if (opcaoDesejada == 2){
                System.out.println("Digite a temperatura em Fahrenheit que você deseja converter para Celsius:");
                double temperaturaDesejada = scanner.nextDouble();
                double f = fahrenheitParaCelsius(temperaturaDesejada);
                System.out.println("A conversão de " + temperaturaDesejada + " graus Fahrenheit para graus Celsius resulta em: " + f + " graus Celsius.");
            } else {
                System.out.println("A opção digitada não é valida! Tente outra opção.");
            }
        }

        scanner.close();

    }
}