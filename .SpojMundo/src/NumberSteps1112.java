

import java.util.Scanner;

public class NumberSteps1112 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        for(int i=0; i<casos; i++)
        {
        	int x = in.nextInt();
        	int y = in.nextInt();

            if((x == y) || (x-2==y))
            {
                if(x%2 == 0)
                    System.out.println(x+y);
                else
                    System.out.println(x+y-1);
            }
            else
                System.out.println("No Number");
        }
	}

}
