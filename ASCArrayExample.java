/* java program to sort in ascending order an array of given integer [45,35,56,67,78,12,20] */

package prg;
import java.util.Arrays;

public class ASCArrayExample {

	public static void main(String[] args) {
		int[] numbers = {45, 35, 56, 67, 78, 12, 20};

        // Sort the array in ascending order using Arrays.sort()
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

	}

}


/* OUtput
Sorted array in ascending order:
12 20 35 45 56 67 78  */
