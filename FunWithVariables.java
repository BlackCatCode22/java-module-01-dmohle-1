// FunWithVariables.java
// dH 8/14/2025
//
 // References:
// https://www.w3schools.com/java/java_user_input.asp

// import statements are at the top of the program

// import the Scanner class
import java.util.Scanner;

public class FunWithVariables {
    public static void main(String[] args) {
        System.out.println("\n\n\n\n\n *** Welcome to my Fun With Variables Program! \n\n");
        // Create a String variable named anything.
        String anything = " something else ";
        System.out.println(anything);

        // Create a coupe of int vars named num1 and num2.
        int num1 = 0;
        int num2 = 0;

        // Create a Scanner object named scanner.
        Scanner scanner = new Scanner(System.in);

        // Get a value from the user and store it in num1.
        System.out.println("\n Please enter a whole number for num1: ");
        num1 = scanner.nextInt();

        // Prove that you got an int from the user.
        System.out.println(" num1 = " + num1);
    }
}