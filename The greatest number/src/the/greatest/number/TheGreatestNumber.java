package the.greatest.number;

import java.util.Scanner;

public class TheGreatestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        int greatest = Math.max(a, Math.max(b, c));

        System.out.println("The greatest number is: " + greatest);
    }
}
