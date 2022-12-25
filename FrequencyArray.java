public class FrequencyArray{

    public static void main(String[] args) {
        

        int a[]={1,1,2,3,4,1,5,7,8,1,9,3,5,9};
        int f[]=new int[a.length];

        /*
        a=
        b = [1,2,3,4,5,7,8,9]
        f = []

         */
        for(int i=0;i<f.length;i++)
        {
            f[i]=-1;
        }
        int count;
        for(int i=0;i<a.length;i++)
        {
            count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    f[j]=0;
                }
            }
            if(f[i]!=0)
            {
                f[i]=count;
            }
        }

        // for(int x:f)
        // {
        //     System.out.print(x+ " ");
        // }

        for(int i=0;i<a.length;i++)
        {
            if(f[i]!=0)
            {
                System.out.println(a[i] + " : " + f[i] + " times");
            }
        }



    }
}