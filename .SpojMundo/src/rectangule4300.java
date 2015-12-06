

import java.util.Scanner;

public class rectangule4300 {

	public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i;
        long total = 0;
        for(i = 1; N >= i*i; i++) 
        {
        	total += (N/i - (i-1));
        	System.out.println("t "+total);
        }
        System.out.println(total);
        
    }


}
