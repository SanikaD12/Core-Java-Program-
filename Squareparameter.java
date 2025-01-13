/* program to find the Perimeter of the square */

package prg;

import java.util.Scanner;

public class Squareparameter {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter the side of the square: ");
		double side=scanner.nextDouble();
		// Calculate the Perimeter of the Square
		double perimeter =4*side;
		System.out.println("Perimeter of the square:"+perimeter);
		scanner.close();

	}

}
/* Output
Enter the side of the square: 10
Perimeter of the square:40.0 */
