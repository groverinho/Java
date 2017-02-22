import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class Ternapitagórica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int c = in.nextInt();
	if ((a*a)+(b*b)==(c*c)) 
	{
		System.out.println("SI");
	}
	else System.out.println("NO");
	}

}
