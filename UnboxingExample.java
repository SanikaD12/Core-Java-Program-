/* java program for unboxing (all types)  */

package prg;

public class UnboxingExample {

	public static void main(String[] args) {
		// Creating wrapper objects 
        Integer integerObject = 10;
        Double doubleObject = 3.14;
        Float floatObject = 2.71f;
        Long longObject = 1234567890L;
        Short shortObject = 123;
        Byte byteObject = 127;
        Boolean booleanObject = true;
        Character characterObject = 'A';

        // Unboxing: Converting wrapper class objects to their primitive types

        int intValue = integerObject; // Unboxing Integer to int
        System.out.println("Integer object: " + integerObject);
        System.out.println("int value: " + intValue);

        double doubleValue = doubleObject; // Unboxing Double to double
        System.out.println("Double object: " + doubleObject);
        System.out.println("double value: " + doubleValue);

        float floatValue = floatObject; // Unboxing Float to float
        System.out.println("Float object: " + floatObject);
        System.out.println("float value: " + floatValue);

        long longValue = longObject; // Unboxing Long to long
        System.out.println("Long object: " + longObject);
        System.out.println("long value: " + longValue);

        short shortValue = shortObject; // Unboxing Short to short
        System.out.println("Short object: " + shortObject);
        System.out.println("short value: " + shortValue);

        byte byteValue = byteObject; // Unboxing Byte to byte
        System.out.println("Byte object: " + byteObject);
        System.out.println("byte value: " + byteValue);

        boolean booleanValue = booleanObject; // Unboxing Boolean to boolean
        System.out.println("Boolean object: " + booleanObject);
        System.out.println("boolean value: " + booleanValue);

        char charValue = characterObject; // Unboxing Character to char
        System.out.println("Character object: " + characterObject);
        System.out.println("char value: " + charValue);


        // Example of how unboxing can be implicit:
        int sum = integerObject + intValue; 
        System.out.println("Sum: " + sum);

	}

}

/* Output
Integer object: 10
int value: 10
Double object: 3.14
double value: 3.14
Float object: 2.71
float value: 2.71
Long object: 1234567890
long value: 1234567890
Short object: 123
short value: 123
Byte object: 127
byte value: 127
Boolean object: true
boolean value: true
Character object: A
char value: A
Sum: 20
*/ 
