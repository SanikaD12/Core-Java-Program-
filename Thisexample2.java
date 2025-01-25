/* java program to invoke current class method using this keyword */

package prg;

class MyClass {

    public void method1() {
        System.out.println("This is method1");
    }

    public void method2() {
        // Invoking method1 using 'this' keyword
        this.method1(); 
        System.out.println("This is method2");
    }
}

class Thisexample2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method2(); 
    }
}


/* Output
This is method1
This is method2
 */
