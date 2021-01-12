// Convert pounds into kilograms

package chapter02;

import java.util.Scanner;

public class Exercise2_04 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.454;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * KILOGRAMS_PER_POUND;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
