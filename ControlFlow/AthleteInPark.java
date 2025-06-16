import java.util.Scanner;

public class AthleteInPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate perimeter
        double perimeter = side1 + side2 + side3;

        // Total distance to cover in meters (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate number of rounds
        double numberOfRounds = totalDistance / perimeter;

        // Output
        System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km");
    }
}
