public class MinFromArray {
    public static void main(String[] args) {
        
        int min;
        int a[]={11,22,4,5,76};

        min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }

        }
        System.out.println("Minimum -> "+ min);
    }
}
