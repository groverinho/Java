import java.util.Scanner;


public class RelationalOperator11172 {

	public static void main(String[] args) 
	{
		Scanner in = new  Scanner(System.in);
		int n = in.nextInt();
		while (n>0)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			if (a>b) 
			{
				System.out.println(">");
			}
			else if (a<b)
			{
				System.out.println("<");
			}
			else
				System.out.println("=");
			n--;
		}


	}

}
