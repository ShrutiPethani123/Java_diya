/*

Polymorphism:- Many forms

2 types:

1. Compile time Polymorphism (Early binding , static Polymorphism)

    -> Method Overloading
        - changing the number of argument
        - changing the data type of argument

2. Runtime Polymorphism (Late Binding , Dynamic Polymorphism)

    -> Method overriding


 */

class Test{

    void add()
    {
        System.out.println("Add with no arg");
    }

    void add(int a)
    {
        System.out.println("add 1 number");
    }

    void add(int a , int b)
    {
        System.out.println("Add 2 number: " + (a+b));
    }

    void add(float c , float d)
    {
        System.out.println("Add 2 float number: " + (c+d));
    }

    // int add(int d)
    // {
    //     System.out.println("add"); - not valid for overloading
    // }
}

public class Polymorphism {
    public static void main(String[] args) {
        
        Test obj = new Test();
        obj.add();
        obj.add(3,4);
        obj.add(4);
        obj.add(4.5f,2.6f);
        
    }
}
