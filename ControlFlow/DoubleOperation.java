import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.print("Enter value of a: ");
        a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        c = sc.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, %.2f%n", result1, result2, result3, result4);
    }
}

