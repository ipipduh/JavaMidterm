package math.problems;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        // Scanner object for capturing user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        // Stored the value in variable
        int num = scan.nextInt();
        // Called user defined function
        int factorial = fact(num);
        System.out.println("Recursion Factorial of " + num + "IS: "+factorial);

        // Find the factorial of this number
        int number = 5;
        long factorial1 = 1;
        int i = 1;
        while (i <= number) {
            factorial1 = factorial1 * i;
            i++;
        }
        System.out.println("Iteration Factorial of " + number + " IS: "+factorial);
        scan.close();
    }

    static int fact(int n) {
        int output;
        if (n==1) {
            return 1;
        }

        // Recursion: Function CALLING ITSELF
        output = fact(n-1) * n;
        return output;
    }
}
