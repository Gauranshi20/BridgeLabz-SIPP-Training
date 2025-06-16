import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        // Swapping
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Output
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
