
import java.util.Scanner;


 public class NextRound {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int  n = in.nextInt();
		int  k = in.nextInt();
		int[] vector = new int[n];
		int cont = 0;
		for (int i = 0; i < n; i++) 
		{
			vector[i]= in.nextInt();
			if(vector[i]!=0)
			{
				if (vector[i]>=vector[k-1]) 
				{
					cont++;
				}
			}
			
		}
		System.out.println(cont);

	}

}
