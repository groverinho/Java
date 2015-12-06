

import java.util.Scanner;
public class AddingReversedNumbers42
{

        public static void main(String[] args)
        {
           Scanner in=new Scanner(System.in);
           int casos=in.nextInt();
          for (int i = 0; i < casos; i++) 
          {
        	   int n=in.nextInt();
               int m=in.nextInt();
               n=reverse(n);
              // System.out.println(n);
               m=reverse(m);
            //   System.out.println(m);
               int sum=n+m;
               System.out.println(reverse(sum));
            }
        }
        public static int reverse(int x)
        {
                int i=10, y=0, sum=0;
                do
                {
                        y=x%10;
                        x=x/10;
                        sum=sum*i+y;
                }while(x!=0);
                return sum;
        }
}



