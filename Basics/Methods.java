/*

1. Built in type
2. User define 
    1. with r.t with arg
    2. with r.t without arg
    3. without r.t without arg
    4. without r.t with arg

 */



public class Methods {

    void display()
    {
        //without r.t without arg
        System.out.println("Good Morning!!");
    }

    int findMax(int x,int y)
    {
        //with r.t with arg
        return x>y?x:y;
    }

    void add(int x,int y)
    {
       // without r.t with arg
        System.out.println("Addition is: "+ (x+y));
    }

    int fact()
    {
        //with r.t without arg
        int c=5;
        int fact=1;
        for(int i=1;i<=c;i++)
        {
            fact = fact*i;
        }
        return fact;
    }

    
    public static void main(String[] args) {
        
        Methods obj = new Methods();
        obj.display();
        System.out.println(obj.findMax(30, 500));
        obj.add(4, 5);
        System.out.println(obj.fact());
        
    }
}
