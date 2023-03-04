/*

super: constructor , method , variable

super: - refer to parent


*/

class A{

    int x=45;
    int z;
    // A()
    // {
    //     System.out.println("A default constructor!!");
    // }

    A(int a)
    {
        System.out.println("A PM constructor!!");
    }

    void data()
    {
        System.out.println("A class method");
    }
}

class B extends A{

    B()
    {
        super(120);
        System.out.println("B default constructor!!");
        // super(120); - invalid
    }

    B(int a)
    {
        // super(34);
        this();
        System.out.println("B PM constructor!!");
        
    }



    

    int x=90;
    void print()
    {
        super.data();
        System.out.println(x + " " + super.z);
    }

    B display()
    {
        return new B();
        // B obj = new B();
        // return obj;
    }




    
}

public class SuperKeyword {
    public static void main(String[] args) {
        
        B obj = new B(34);
        obj.print();

        B obj1 = obj.display();
        obj1.print();
    }
}
