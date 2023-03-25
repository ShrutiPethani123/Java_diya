/*

-> we can't inherite final class
-> we can't override final method
-> we can't change value of final variable.

 */
class RBI{

    final int c=50;
    final int d;

    RBI(int g)
    {
        d=g;
    }

    final int print()
    {
        // c=500;
        return 9;
    }

}

// class BOB extends RBI{

//     int print()
//     {

//     }
// }


public class FinalKeyword {
    public static void main(String[] args) {
        

    }   
}
