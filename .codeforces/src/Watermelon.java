import java.util.Scanner;
public class Watermelon 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		   int peso = in.nextInt();
		    if(peso == 2)
		       System.out.println("NO" );
		    else
		    
		    	System.out.println(peso % 2 == 0 ? "YES" : "NO");
	}
}
