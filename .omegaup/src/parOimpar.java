import java.util.Scanner;


public class parOimpar {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in );
		int a = in.nextInt();
		if (a % 2 ==0) {
			System.out.println("par");
		}
		else
			System.out.println("impar");
	}

}
