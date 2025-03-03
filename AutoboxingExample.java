/* java program for autoboxing (all primitive types )*/

package prg;

public class AutoboxingExample {

	public static void main(String[] args) {
		// Autoboxing: Converting primitive types to their wrapper classes

        // Integer
        int intValue = 10;
        Integer integerObject = intValue; // Autoboxing int to Integer
        System.out.println("int value: " + intValue);
        System.out.println("Integer object: " + integerObject);


        // Double
        double doubleValue = 3.14;
        Double doubleObject = doubleValue; // Autoboxing double to Double
        System.out.println("double value: " + doubleValue);
        System.out.println("Double object: " + doubleObject);

        // Float
        float floatValue = 2.71f;  // Note the 'f' for float literal
        Float floatObject = floatValue; // Autoboxing float to Float
        System.out.println("float value: " + floatValue);
        System.out.println("Float object: " + floatObject);


        // Long
        long longValue = 1234567890L; // Note the 'L' for long literal
        Long longObject = longValue; // Autoboxing long to Long
        System.out.println("long value: " + longValue);
        System.out.println("Long object: " + longObject);

        // Short
        short shortValue = 123;
        Short shortObject = shortValue; // Autoboxing short to Short
        System.out.println("short value: " + shortValue);
        System.out.println("Short object: " + shortObject);

        // Byte
        byte byteValue = 127;
        Byte byteObject = byteValue; // Autoboxing byte to Byte
        System.out.println("byte value: " + byteValue);
        System.out.println("Byte object: " + byteObject);

        // Boolean
        boolean booleanValue = true;
        Boolean booleanObject = booleanValue; // Autoboxing boolean to Boolean
        System.out.println("boolean value: " + booleanValue);
        System.out.println("Boolean object: " + booleanObject);

        // Character
        char charValue = 'A';
        Character characterObject = charValue; // Autoboxing char to Character
        System.out.println("char value: " + charValue);
        System.out.println("Character object: " + characterObject);


        // Demonstrating usage of the wrapper objects (Integer in this example)
        int anotherIntValue = integerObject + 5; // Unboxing and then addition
        System.out.println("anotherIntValue (unboxing + addition): " + anotherIntValue);

	}

}


/* Output
int value: 10
Integer object: 10
double value: 3.14
Double object: 3.14
float value: 2.71
Float object: 2.71
long value: 1234567890
Long object: 1234567890
short value: 123
Short object: 123
byte value: 127
Byte object: 127
boolean value: true
Boolean object: true
char value: A
Character object: A
anotherIntValue (unboxing + addition): 15 
 */
