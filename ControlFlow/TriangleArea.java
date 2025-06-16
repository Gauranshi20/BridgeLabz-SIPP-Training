import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / (2.54 * 2.54); // Convert cm² to in²

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaIn2, areaCm2);
    }
}
