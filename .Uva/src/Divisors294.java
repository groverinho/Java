import java.util.Scanner;


public class Divisors294{

  public static  int divisores(int n)
    {
        int c=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
	            if(i*i==n)
	                c++;
	            else
	                c+=2;
	        }
        }    
            return c;
    }
    public static  void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int j=1;j<=t;j++)
        {
            int max=0;
            int num=0;
            int l=in.nextInt();
            int h=in.nextInt();
            for(int i=l;i<=h;i++)
            {
                int div=divisores(i);
                if(max<div)
                {
                    max=div;
                    num=i;
                }
            }
            System.out.println("Between "+l+" and "+h+", "+num+" has a maximum of "+max+" divisors.");
        }
    }
}