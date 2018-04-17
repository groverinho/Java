import java.util.Scanner;


public class Quientienemasdinero {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);	
		int juan1 = in.nextInt();
		int juan2 = in.nextInt();
		int juan3 = in.nextInt();
		int pedro1 = in.nextInt();
		int pedro2 = in.nextInt();
		if ((juan1+juan2+juan3)>(pedro1+pedro2))
		{
			System.out.println("Juan");
		}
		else
			System.out.println("Pedro");
		

	}

}
