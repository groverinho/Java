import java.util.Scanner;


public class coprimos {

	public static int Euclides(int a, int b) 
	{
		int r=b;
		while (b> 0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return (a);
	}
	public static void main(String[] args) 
	{
		Scanner in =  new Scanner(System.in);
		int n = in.nextInt();
		int c=0;
		for (int i = 1; i < n; i++) 
		{
			if (Euclides(i, n)==1) 
			{
				c++;
			}
		}
		System.out.println(c);

	}

}
