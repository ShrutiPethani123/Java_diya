/*

Arithmetic operator -->  + - * / %
Relational operator -->  < > <= >= == !=
Assignment operator -->  += -= *=  =  /=  %=....
Logical Operator  --> && || !
Bitwise operator --> & | ~ ^ << >>
inc/dec operator  -->  ++ --
ternary operator --> ? :

&&

A   B   A&&B
F   F   F
F   T   F
T   F   F
T   T   T

||

A   B   A||B

F   F   F
F   T   T
T   F   T
T   T   T

!

A   B

T   F
F   T


 */

public class Operator {
    public static void main(String[] args) {

        int c=45;
        int d=23;
        System.out.println(c+=d);
        System.out.println(c);

        // c=c+d;
        // c+=d;


        int x=8;
        System.out.println(x++ <9 && x--<7); // && 
        System.out.println(x);

        System.out.println(!(x>5));

        int r=30;
        System.out.println(r++);//30
        System.out.println(r);//31
        System.out.println(++r);//32
        System.out.println(r);//32

        System.out.println(r++ + r++ + ++r + r++);// 32(33) + 33(34) + 35(35)+35(36) 
        System.out.println(r);
        
        int aa=10;
        int bb=45;
        int max;

        // if(aa>bb)
        // {
        //     max=aa;
        // }else{
        //     max=bb;
        // }

        max = aa>bb ? aa:bb;
        System.out.println(max);

        
        //----------Binary to decimal --------------//

        /*
        
        1010 - 10
        0101 0101 -  85
        1010 1111 - 175
        1111 1111 - 255
        


        //----------Decimal to Binary --------------//

            128    64    32    16    8    4    2    1

        12 - 1100
        15 - 1111
        10 - 1010
        43 - 0010 1011
        55 - 0011 0111



         */

         System.out.println("Addition is: "+ (10+12));
         System.out.println(10+20+ "Addition is");

    }
}
