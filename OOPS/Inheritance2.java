/*

    Animal
    /   \
 Dog    Cat


 */

class Animal{

    int leg=4;
    void eat()
    {
        System.out.println("Eating.....");
    }
}

class Dog extends Animal{

    void bark()
    {
        System.out.println(leg);
        System.out.println("barking...");
    }

}

class Cat extends Animal {

    void play()
    {
        System.out.println("Playing....");
    }

}

public class Inheritance2 {
    public static void main(String[] args) {
        
        Cat c = new Cat();
        c.play();
        // c.bark(); - invalid
        c.eat();

        Dog d = new Dog();
        d.bark();
        // d.play();
        d.eat();

        Animal a = new Animal();
        a.eat();
    }
}
