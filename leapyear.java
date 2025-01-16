/* program to check leap year using if else. How to check whether a given year is a leap year or not */

package project;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();

	}

}

/* Output
Enter a year: 2022
2022 is not a leap year. */
