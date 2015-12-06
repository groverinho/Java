import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ChefAndNewRecipe {

	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			int n = in.nextInt();
			ArrayList<Integer> ingredientes = new ArrayList<Integer>();
			for (int i = 0; i < n; i++)
				ingredientes.add(in.nextInt());
			if (ingredientes.contains(1))
			{
				System.out.println(-1);
			}
			else if (n==1)
			{
				System.out.println(2);
			}
			else
			{
				Collections.sort(ingredientes);
				if (ingredientes.get(0)%2==0)
					System.out.println(ingredientes.get(0)*n);
				else
					System.out.println((ingredientes.get(0)-1)*n);
				
			}
		}
	}

}
