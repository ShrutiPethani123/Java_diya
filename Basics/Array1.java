/*

Array -> collection of element that have same data types

4 8 5 6 1 2 3
0 1 2 3 4 5 6

-> index start with 0
-> index end with size-1
-> all elements have continuos memory location.



 */


public class Array1 {
    public static void main(String[] args) {
        
        // int a[]=new int[6]; // declaration 
        // char ch[]=new char[8];
    
        // String str[];
        // str=new String[6];

        // int[] b=new int[8];

        // // int c[]=new byte[6]; // invalid

        int a[]=new int[5];
        int b[]={1,2,3,4,5,76,8,9};
        // a={1,2,3,4,5}; 

        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+ " ");
        }

        // for each loop
        /*
        
        for(data_type x : arr_name)
        {
            sout(x+" ");
        }

         */
        System.out.println();
        for(int x:b)
        {
            x+=2;
            System.out.print(x+" ");
        }
        
        System.out.println();
        for(int i=0;i<b.length;i++)
        {
            b[i]=b[i]+2;
            System.out.print(b[i]+ " ");
        }




    }
}
