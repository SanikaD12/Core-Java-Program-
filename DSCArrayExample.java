/* java program to sort in descending order an array of given string [A,X,D,Z,Y,C,W,B]*/

package prg;
import java.util.Arrays;
import java.util.Collections;

public class DSCArrayExample {

	public static void main(String[] args) {
		String[] letters = {"A", "X", "D", "Z", "Y", "C", "W", "B"};

        // Sort the array in ascending order
        Arrays.sort(letters);

        // Reverse the sorted array to get descending order
        Collections.reverse(Arrays.asList(letters));

        // Print the sorted array in descending order
        System.out.println("Sorted array in descending order:");
        for (String letter : letters) {
            System.out.print(letter + " ");
        }

	}

}

/* Output
Sorted array in descending order:
Z Y X W D C B A  */
