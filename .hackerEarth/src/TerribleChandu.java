import java.util.Scanner;


public class TerribleChandu {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos -->0)
		{
			StringBuilder cad = new StringBuilder(in.next());
			cad = cad.reverse();
			System.out.println(cad);
	
		}
		
	}

}
