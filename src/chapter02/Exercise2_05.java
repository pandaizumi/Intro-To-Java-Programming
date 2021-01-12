// Calculate Tips: Read in a subtotal and gratuity rate,
// then compute the gratuity and total.

package chapter02;

import java.util.Scanner;

public class Exercise2_05 {
    public static void main(String[] args) {
        double subtotal;
        double gratuityRate;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);

        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity +
                " and total is $" + total);
    }
}
