/*

byte - nextByte()
boolean - nextBoolean()
short - nextShort()
int - nextInt()
long - nextLong()
float - nextFloat()
double - nextDouble()
char - 
String - next() , nextLine()

 */


import java.util.*;


public class UserInput {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // A obj = new A();

        // System.out.println("Enter a no: ");
        // int n= sc.nextInt();
        // System.out.println(n);
        // sc.nextLine();

        // System.out.println("Enter your name: ");
        // String str = sc.next();
        // System.out.println("Name is: " + str );

        // System.out.println("Enter gender: ");
        // char ch = sc.next().charAt(0);
        // System.out.println(ch);

        System.out.println("Enter your name: ");
        // String str=sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println("Name is "+ch);

        
    }

}

/*

    Name - string
    age - byte
    gender - char
    address - string
    department Id-short
    department name - string
    addmission year - int
    Id - long 




 */