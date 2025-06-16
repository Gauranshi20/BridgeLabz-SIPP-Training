import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        // Conversion
        double kilograms = pounds / 2.2;

        // Output
        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kilograms);
    }
}
