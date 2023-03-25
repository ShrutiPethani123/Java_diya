import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter element for array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }

        System.out.println("______Array_____");
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }   
}

