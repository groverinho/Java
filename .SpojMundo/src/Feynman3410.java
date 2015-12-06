

import java.util.Scanner;
 class Feynman3410 {

	public static void main(String [] args)
	{
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            while(n != 0)
            {
                if(n == 1)
                    System.out.println(1);               
                else
                    System.out.println(((n)*(n+1)*(n * 2 + 1))/6);
                n = in.nextInt();
            }
    }
}

 	