import java.util.Arrays;
import java.util.Scanner;


public class AcomodaelnumeroLENTO 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		int []vector = new int [n];
		for (int i = 0; i < vector.length; i++) 
			vector[i]= in.nextInt();
		int aux = vector[0];
		Arrays.sort(vector);
		int c=0;
		for (int i = 0; i < vector.length; i++) 
		{
			if (vector[i]==aux)
				break;	
			else	
				c++;
		}
		System.out.println(c);
	}
}
