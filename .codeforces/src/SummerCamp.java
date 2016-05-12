import java.util.Scanner;
public class SummerCamp {

	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		String cad = "";
		for (int i = 1; i <=1000; i++) 
			cad+=i;
		int n=in.nextInt();
		System.out.println(cad.charAt(n-1));
	}

}
