/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and 
   has an additional attribute called "color" and a method called "honk". Create an object of the Car class and call both the "drive" and "honk" methods.
 */

package prg;
class Vehicle {
    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void drive() {
        System.out.println("The " + brand + " " + model + " is driving.");
    }
}

class Car extends Vehicle {
    String color;

    Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    void honk() // // Method to simulate the car honking
    {
        System.out.println("Beep! Beep!");
    }
    public static void main(String[] args) {
        Car myCar = new Car("Ford", "Mustang", 2023, "Red");

        myCar.drive();
        myCar.honk();
    }
}

/* output
 The Ford Mustang is driving.
Beep! Beep! */
