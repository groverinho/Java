import java.util.Scanner;


public class feynman {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();	
		while (n!=0) 
		{	
			System.out.println(recur(n));
			n = in.nextInt();
		}	
	}
	public static int recur(int n)
	{
		int acu = 0;
		 if(n==1)
			 return n;
		return n*n+recur(n-1);
	}

}
