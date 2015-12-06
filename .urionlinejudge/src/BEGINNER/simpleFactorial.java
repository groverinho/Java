package BEGINNER;
import java.util.Scanner;
public class simpleFactorial {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		while (n!=0)
		{
			System.out.println(fact(n));
			n= in.nextInt();
		}
	}
	public static int fact(int n)
	{
	      if(n==0) return 1;  
	      else return n*fact(n-1); 
	} 

}
