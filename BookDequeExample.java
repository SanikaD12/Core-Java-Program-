import java.util.ArrayDeque;

public class BookDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque to store book names
        ArrayDeque<String> bookDeque = new ArrayDeque<String>();

        // Add book names to both ends of the deque
        bookDeque.add("The Great Gatsby");   // Default add (to the end)
        bookDeque.add("To Kill a Mockingbird");  // Default add (to the end)
        bookDeque.addFirst("1984");          // Add to the front
        bookDeque.addLast("Moby Dick");      // Add to the end
        
        // Print the current deque
        System.out.println("Books in deque after adding from both ends:");
        System.out.println(bookDeque);  // Prints all elements in the deque

        // Remove books from both ends
        String removedFirst = bookDeque.removeFirst(); // Remove from the front
        String removedLast = bookDeque.removeLast();   // Remove from the end
        
        // Print the book names removed from both ends
        System.out.println("\nRemoved from front: " + removedFirst);
        System.out.println("Removed from end: " + removedLast);
        
        // Print the current deque after removals
        System.out.println("\nBooks in deque after removals:");
        System.out.println(bookDeque);  // Prints remaining elements in the deque
    }
}

/*
 Output:

Books in deque after adding from both ends:
[1984, The Great Gatsby, To Kill a Mockingbird, Moby Dick]

Removed from front: 1984
Removed from end: Moby Dick

Books in deque after removals:
[The Great Gatsby, To Kill a Mockingbird]
*/
