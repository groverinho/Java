package MATHEMATICS;
import java.util.Scanner;


public class blobs {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int c=0;
		while (casos>0)
		{
			double n = in.nextInt();
			
			while (n>1) 
			{	
				
				n=n/2;
				c++;
			}
		
			System.out.println(c+" dias");	
			c=0;
			casos--;
		}
	}

}