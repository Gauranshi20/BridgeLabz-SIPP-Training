import java.util.Scanner;
public class Qtwntytwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pounds = sc.nextDouble();
        double kg = pounds / 2.2;
        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kg);
    }
}
