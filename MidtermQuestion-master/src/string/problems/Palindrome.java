package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        CheckIfPalindrome();
    }

    public static void CheckIfPalindrome() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter The string Name ");
        String name = scan.nextLine();
        scan.close();
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        if (name.equals(rev)) {
            System.out.println(" The String Name Is Palindrome :" + name);
        } else {
            System.out.println(" The String Name Is Not Palindrome :" + name);
        }

    }
}
