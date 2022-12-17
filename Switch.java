import java.util.Scanner;
public class Switch{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();

        // long d=sc.nextLong(); 
        // float f=sc.nextFloat();
        // double d = sc.nextDouble();
        // char ch = sc.next().charAt(0);
        // String ch=sc.next();
        // byte b = sc.nextByte();
        // boolean b = sc.nextBoolean();

        // boolean , float , long , double ->not valid to pass in switch
        // byte , short , int , char , String -> valid

        switch(n)
        {
            case 1:
                
            case 2: 
                     
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satuarday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}