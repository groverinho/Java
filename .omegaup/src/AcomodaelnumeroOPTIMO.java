import java.util.Scanner;
public class AcomodaelnumeroOPTIMO 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);		
		int n  = in.nextInt();
		int []vector = new int [n-1];
		int aux = in.nextInt();
		int c =0;
		for (int i = 0; i < vector.length; i++) 
		{
			vector[i]= in.nextInt();
			if (aux >vector[i]) 
				c++;
		}
		System.out.println(c);
	}
}
