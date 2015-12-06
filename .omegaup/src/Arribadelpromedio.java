import java.util.Scanner;


public class Arribadelpromedio {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0)
		{
			double n = in.nextInt();
			double []vector = new double [(int) n];
			double acu = 0;
			for (int i = 0; i < n; i++) 
			{
				vector[i]= in.nextInt();
				acu= acu+ vector[i];
			}
			double t = acu/n;
			double aux=0;
			for (int i = 0; i < n; i++)
			{
				if (vector[i]>t)
				{
					aux++;
				}
			}
			double total = (aux*100)/n;
			System.out.printf("%.3f",total);
			System.out.println("%");
			casos--;
		}
	}

}
