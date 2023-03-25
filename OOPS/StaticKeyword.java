/*

static : class , methods , variables , block

-> outer class can not be static only inner class can be static
-> we can't access non static variable int a static method.
-> for static variable same memory allocation for all objects.
-> you can call static method without using objects. (className.Methodname())


 */
class Test{


    // static class Exam{


    // }
    static int count=0;
    int x=50;
    Test()
    {
        System.out.println("Count: " + count++);
    }

    void display()
    {
        System.out.println(count + " " + x);
        print();
    }

    static void print()
    {
        int y=4;
        // display();
        System.out.println(count + " " + y);
    }

    {

        System.out.println("Instance block!!");
    }


    static{
        System.out.println("static block!!!");
    }

} 


public class StaticKeyword{
 
    static int a = 56;
    public static void main(String[] args) {
        
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t3.count=45;
        System.out.println(Test.count);
        System.out.println(StaticKeyword.a);
        t2.display();
        Test.print();
    }
}