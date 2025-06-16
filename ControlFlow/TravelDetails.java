import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Inputs
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter To City: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from From City to Via City (in miles): ");
        double fromToVia = sc.nextDouble();
        System.out.print("Enter distance from Via City to Final City (in miles): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time from From City to Via City (in minutes): ");
        int timeFromToVia = sc.nextInt();
        System.out.print("Enter time from Via City to Final City (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        // Calculations
        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Output
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity +
                " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
    }
}
