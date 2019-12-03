import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature;

        System.out.println("Enter temperature in Fahrenheit ");
        temperature = input.nextDouble();
        System.out.printf("Celsius equivalent is %.2f", conversionInCelsius(temperature));

        System.out.println();

        System.out.println("Enter temperature in Celsius ");
        temperature = input.nextDouble();
        System.out.printf("Fahrenheit equivalent is %.2f", conversionInFahrenheit(temperature));
    }
    public static double conversionInCelsius(double temperatureInFahrenheit){
        return 5.0 / 9.0 * (temperatureInFahrenheit - 32);
    }

    public static  double conversionInFahrenheit(double temperatureInCelsius){
        return 9.0 / 5.0 * temperatureInCelsius + 32;
    }
}
