package conversorTemperatura;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("Escolha a conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("3 - Celsius para Kelvin");
        System.out.println("4 - Kelvin para Celsius");
        System.out.println("5 - Fahrenheit para Kelvin");
        System.out.println("6 - Kelvin para Fahrenheit");

        int opcao = sc.nextInt();
        System.out.print("Digite o valor da temperatura: ");
        double valor = sc.nextDouble();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = celsiusParaFahrenheit(valor);
                System.out.printf("%.2f °C = %.2f °F%n", valor, resultado);
                break;
            case 2:
                resultado = fahrenheitParaCelsius(valor);
                System.out.printf("%.2f °F = %.2f °C%n", valor, resultado);
                break;
            case 3:
                resultado = celsiusParaKelvin(valor);
                System.out.printf("%.2f °C = %.2f K%n", valor, resultado);
                break;
            case 4:
                resultado = kelvinParaCelsius(valor);
                System.out.printf("%.2f K = %.2f °C%n", valor, resultado);
                break;
            case 5:
                resultado = fahrenheitParaKelvin(valor);
                System.out.printf("%.2f °F = %.2f K%n", valor, resultado);
                break;
            case 6:
                resultado = kelvinParaFahrenheit(valor);
                System.out.printf("%.2f K = %.2f °F%n", valor, resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }

    public static double celsiusParaFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusParaKelvin(double c) {
        return c + 273.15;
    }

    public static double kelvinParaCelsius(double k) {
        return k - 273.15;
    }

    public static double fahrenheitParaKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinParaFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }
	

}
