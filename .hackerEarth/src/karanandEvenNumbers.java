import java.util.Scanner;


public class karanandEvenNumbers {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		while (n!=-1)
		{
			if(n % 2 == 0)
				System.out.println(n);
			n = in.nextInt();
		}

	}

}
