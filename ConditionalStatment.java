/*

Conditional Statment

if else
    -> simple if
    -> if else
    -> nested if
    -> else if ladder

switch
loops

 */
import java.util.Scanner;

public class ConditionalStatment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no:");
        int n = sc.nextInt();

        // if(n>0)
        // {
        //     if(n>10)
        //     {
        //         System.out.println(n+" is greater than 10");
        //     }
        //     else{
        //         System.out.println(n + " is less than 10");
        //     }

        // }else if(n==0)
        // {
        //     System.out.println("ZERO");
        // }
        // else{
        //     System.out.println(n + " is negative ");
        // }

        int b=5;
        int c=6;

        System.out.println(b+c);
        System.out.println("Addition is: "+ b+c);
        System.out.println("Addition is: "+ (b+c));
        System.out.println(b+c + " Addition is: "+ b+c);
    }

}
