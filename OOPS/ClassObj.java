// package OOPS;

/*

1. POPS -> C , C++
2. OOPS -> C++ , JAVA , python

-> class
-> object
-> Encapsulation
-> Inheritance
-> Abstraction
-> Polymorphism


 */

class Car{

    // instance variable (Data Member)
    int wheel=4;
    String color;
    int seat;

    // Method (Member function)
    void run(String s)
    {
        System.out.println(s+ " Running!!!");
    }

}

public class ClassObj {

    public static void main(String[] args) {
        
        Car bmw = new Car();
        System.out.println(bmw.wheel);
        bmw.color="black";
        System.out.println(bmw.color);
        System.out.println(bmw.seat);
        bmw.run("bmw");

        Car odi = new Car();
        System.out.println(odi.wheel);
        odi.color="white";
        System.out.println(odi.color);
        System.out.println(odi.seat);
        odi.run("ODI");
    }
    
}
