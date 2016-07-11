import java.util.Arrays;
import java.util.Scanner;


public class SumaExacta {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		while (in.hasNext()) {
			
		
		int n =in.nextInt();
		
		int vector []= new int [n];
		int acu = 0;
		for (int i = 0; i < vector.length; i++) {
			vector[i]=in.nextInt();
			
		}
		int m =in.nextInt();
		Arrays.sort(vector);


		int a=0, b=0;
		for (int i = 0; i < vector.length; i++)
		{
			for (int j = 1; j < vector.length; j++) 
			{
				if (vector[i]+vector[j]==m)
				{
					a=vector[i];
					b=vector[j];
					break;
				}
			}
		}

		if (a==0 && b==0)
		{
			System.out.println("-1");
		}
		else
		{
			if (a>b)
			{
				System.out.println(b+" "+a);
			}
			else
				System.out.println(a+" "+b);
		}
	}

}}
