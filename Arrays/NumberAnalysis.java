import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Analyze each number
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even.");
                } else {
                    System.out.println(num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println(num + " is Zero.");
            }
        }

        // Compare first and last element
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are Equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is Greater than the last element.");
        } else {
            System.out.println("First element is Less than the last element.");
        }

        sc.close();
    }
}
