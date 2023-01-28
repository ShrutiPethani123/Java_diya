/*

Inheritance: 

Parent (super) (base)
   |
child (sub) (derived)

-> code Reusability


Types:

1. single level
2. Multi level
3. Multiple -> not supported in java
4. hyrarchical
5. Hybrid


1. single level

    A
    |
    B

2. Multi level inheritance

    A
    |
    B
    |
    C

3. Multiple inheritance

    A   B
    \   /
      C

      -> Ambiguity Problem

4. Hyrarchical Inheritance

         A
        / \
       B   C

5. Hybrid Inheritance

    A
    |
    B
   / \
   C  D


 */


class Parent{

    void print()
    {
        System.out.println("Parent class");
    }
}
class Child extends Parent{

    void display()
    {
        System.out.println("Child class");
    }
}

class GrandChild extends Child{

    void play()
    {
        System.out.println(" Grand Child class");
    }
}


public class Inheritance {
    
    public static void main(String[] args) {
        
        GrandChild gc = new GrandChild();
        gc.play();
        gc.print();
        gc.display();

        Child c = new Child();
        c.display();
        c.print();

        Parent p = new Parent();
        // p.display();
        p.print();
    }
}
