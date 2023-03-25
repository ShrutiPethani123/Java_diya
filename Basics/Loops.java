/*

LOOPS 

1. Entry control Loop
    1. For
    2. while
2. Exit control loop
    1. do while

     
--> for

for(intializtion ; condition ; inc/dec)
{
    // blocl of code
}

--> while

    intializtion

    while(condition)
    {
        inc/dec;
    }

--> do while

    intialization
    do{
        // block of code
        inc/dec

    }while(condition);




 */

public class Loops {
    public static void main(String[] args) {

        for(int i=0;i<5;i++)
        {
            System.out.print(i+ " ");
        }

        System.out.println();
        for(int i=1;i<=10;i++)
        {
            System.out.println("5 * "+ i +" = "+ 5*i);
        }

        // for(;;)
        // {
        //     System.out.println("hello");
        // }

        int k=1;
        while(k<5)
        {
            System.out.print(k+" ");
            k++;
        }
        System.out.println();

        k=5;
        while(k>=1)
        {
            System.out.println(k+" ");
            k--;
        }

        System.out.println();
        int j=1;
        do{
            System.out.print(j+ " ");
            j++;

        }while(j>=5);
        
        
        

    }
}
