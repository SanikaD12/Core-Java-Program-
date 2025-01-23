/* java program to check given number is perfect number or not */

package prg;
import java.util.Scanner;
public class PerfactNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumOfDivisors = 0; 

        // Iterate through all numbers from 1 to number-1
        for (int i = 1; i < number; i++) { 
            if (number % i == 0) { // Check if 'i' is a divisor of 'number'
                sumOfDivisors += i; 
            }
        }

        if (sumOfDivisors == number) {
            System.out.println(number + " is a perfect number."); 
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();

	}

}

/* Output
Enter a number: 24
24 is not a perfect number. */
