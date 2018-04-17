import java.util.Scanner;


public class NivelOptimo {

	public static void main(String[] args)
	{
		Scanner in  =new Scanner(System.in);
		int a = in.nextInt();
		
		int b = in.nextInt();
		if (a==b)
		{
			System.out.println("Nivel Optimo");
		}
		else if (a<b)
		{
			System.out.println(1+" "+(b-a));
		}
		else
		{
			System.out.println(2+" "+(a-b));
		}

	}

}
