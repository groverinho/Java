import java.util.Scanner;


public class digitos {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		String cad ="";
			for (int i = 1; i <=n; i++) 
			{
				cad = cad+i;
				System.out.println(cad);
			}
	//		System.out.println(cad);
	}

}
