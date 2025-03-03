import java.util.TreeSet;

public class IntegerTreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet to store integer values
        TreeSet<Integer> numbersSet = new TreeSet<Integer>();

        // Add integer values to the TreeSet
        numbersSet.add(50);
        numbersSet.add(30);
        numbersSet.add(70);
        numbersSet.add(10);
        numbersSet.add(40);
        numbersSet.add(60);
        numbersSet.add(20);

        // Print the elements of the TreeSet (it will be sorted in ascending order)
        System.out.println("Integers in the TreeSet (sorted):");
        for (Integer number : numbersSet) {
            System.out.println(number);
        }
    }
}

/*
Expected Output:

Integers in the TreeSet (sorted):
10
20
30
40
50
60
70
*/
