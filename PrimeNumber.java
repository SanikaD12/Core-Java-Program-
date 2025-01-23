/* java program to check given number is prime number or not  */ 

package prg;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // A prime number is a natural number greater than 1 
        // that has no positive divisors other than 1 and itself.
        boolean isPrime = true; 

        // Handle special cases: 0 and 1 are not prime
        if (number <= 1) { 
            isPrime = false; 
        } else {
            // Check for divisibility by 2 
            if (number % 2 == 0 && number > 2) { 
                isPrime = false; 
            } else {
                // Check for divisibility by odd numbers 
                for (int i = 3; i * i <= number; i += 2) { 
                    if (number % i == 0) {
                        isPrime = false;
                        break; 
                    }
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();

	}

}

/* Output
Enter a number: 7
7 is a prime number. */
