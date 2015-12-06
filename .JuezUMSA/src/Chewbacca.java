import java.util.Scanner;


public class Chewbacca {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String cad = in.nextLine();
		if (cad.contains("e"))
		{
			System.out.println("Han Solo");
		}
		else
		{
			System.out.println("Chewbacca");
		}

	}

}
