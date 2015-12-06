import java.util.Scanner;


public class absolute {

	public static int absValue(int n)
	{
		return Math.abs(n);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(absValue(n));


	}

}
