// package OOPS;

/*

There are 3 types of variable

1. Instance Variable
2. Local Variable
3. Static Variable

 */

class Test{

    int a=67;
    float b; // instance variable

    void print()
    {
        int x; // local Variable
        x=50;
        System.out.println("value of x is: " + x);
        System.out.println(a);
    }



}

public class VariableTypes {
    
    int s=100; // instance variable
    public static void main(String[] args) {
        
        Test t = new Test();
        System.out.println(t.a);
        System.out.println(t.b);
        t.print();

        VariableTypes obj = new VariableTypes();
        System.out.println(obj.s);

        int z=49; // local variable
        System.out.println(z);
    }
}
