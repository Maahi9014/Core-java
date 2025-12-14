public class nthPrime {
    public static void main(String[]args)
    {
        int n=5;
        int count=0;
        while(true)
        {
            while(true)
            {
                int i=1;
                int number=i;
                int count2=0;
                for(int j=0;j<=number;j++)
                {
                    if (number % j == 0)
                    {
                        count2++;
                    }
                }
                if(count2==2)
                {
                    count++;
                }


            }

        }



    }
}
