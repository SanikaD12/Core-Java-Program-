/* Java program to take Employee id,name,address & salary from user and display on to screen. */

package prg;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter employee ID: ");
		int employeeID =scanner.nextInt();
		System.out.print("Enter employee Name: ");
		scanner.nextLine(); 
		String employeeName =scanner.nextLine();
		System.out.print("Enter employee Address: ");
		String employeeAddress =scanner.nextLine();
		System.out.println("Enter employee Salary: ");
		double employeeSalary =scanner.nextDouble();
		// Display employee information 
		System.out.println("Employee Information");
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Address: "+employeeAddress);
		System.out.println("Employee Salary: "+employeeSalary);
		scanner.close();

	}

}
/* Output
Enter employee ID: 123
Enter employee Name: John
Enter employee Address: 123 main st
Enter employee Salary: 
500000
Employee Information
Employee ID: 123
Employee Name: John
Employee Address: 123 main st
Employee Salary: 500000.0 */
