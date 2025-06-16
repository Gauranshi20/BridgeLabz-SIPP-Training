import java.util.Scanner;

public class DiscountUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee, discountPercent;

        System.out.print("Enter course fee: ");
        fee = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        discountPercent = sc.nextDouble();

        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}
