/*java program to pass this keyword as argument in the constructor call */

package prg;

class A {
    B obj;

    A(B obj) {
        this.obj = obj;
        obj.display(); // Calling a method of class B using the passed object
    }
}

class B {
    int x = 5;

    B() {
        A obj = new A(this); // Passing 'this' (current B object) to the constructor of A
    }

    void display() {
        System.out.println("Value of x in Class B: " + x);
    }
}

class Thisexample {
    public static void main(String[] args) {
        B objB = new B(); // Creating an instance of class B
    }
}


/* Output
Value of x in Class B: 5
 */
