package BEGINNER;
import java.util.Scanner;


public class Brazil {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) 
		{
			
			int c = in.nextInt();
			if (c==0)
			{
			System.out.println("vai ter copa!");	
			}
			else
			System.out.println("vai ter duas!");
		}

	}

}
