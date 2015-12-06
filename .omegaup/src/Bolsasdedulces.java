import java.util.Scanner;


public class Bolsasdedulces {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int acu = 0;
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			acu = acu + (a*b);
		}
		System.out.println(acu);
	}

}
