// package OOPS;

/*

constructor

-> Name of constrcator is same as class name
-> do not have any return type
-> use: intialize the instance variable 
-> It will automatically call when objects are created

Types:

1. Default constrctor
2. Perametrized constructor
3. Copy constructor



 */

class Test{

    int x;
    float y;

    Test()
    {
        // default constructor
        System.out.println("Default constructor called!!");
        x=100;
    }

    Test(int a,int b)
    {
        System.out.println("Perametrized constructor called!!");
        x=a;
        y=b;
    }

    
    Test(int a)
    {
        System.out.println("Second Perametrized constructor called!!");
        x=a;   
    }

    Test(Test t)
    {
        System.out.println("Copy Constructor called!!");
        x=t.x;
        y=t.y;
    }

}

public class Constructor {
    
    public static void main(String[] args) {
        
        Test t = new Test();
        System.out.println(t.x);
        System.out.println(t.y);

        Test t1 = new Test(3,4);
        System.out.println(t1.x);
        System.out.println(t1.y);

        Test t3 = new Test(45);
        System.out.println(t3.x);
        System.out.println(t3.y);

        Test t4=new Test(t1);
        System.out.println(t4.x);
        System.out.println(t4.y);

    }

}
