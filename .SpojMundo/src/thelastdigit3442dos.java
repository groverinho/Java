

import java.util.Scanner;

 class thelastdigit3442dos {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int t=in.nextInt(), a, i, c; long b; String s;
        while(t-->0)
        {
            s=in.next();
            a=Integer.parseInt(s.substring(s.length()-1));
            b=in.nextLong();
            a%=10;
            if(b == 0)
            {
            	System.out.println(1);
            	//continue;
            }
            if(a == 0)
            {
            	System.out.println(0); 
            	//continue;
            }
            b%=4;c=1;
            if(b==0)
            	b=4;
            for(i = 0; i < b; i++)c*=a;
            System.out.println(c%10);
        }
    }

}
