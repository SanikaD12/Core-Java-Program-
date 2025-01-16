/*  java program to check  candidate eligible for voting or not */

package prg;
import java.util.Scanner;
public class voting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the age is greater than or equal to 18
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();

	}

}

/* Output 
Enter your age: 23
You are eligible to vote.*/
