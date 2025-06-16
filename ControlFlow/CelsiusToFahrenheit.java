import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Conversion Formula: (°C × 9/5) + 32
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
    }
}
