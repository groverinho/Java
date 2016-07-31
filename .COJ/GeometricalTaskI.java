import java.util.Scanner;


public class GeometricalTaskI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = in.next();
		if (cad.equals("square"))
		{
			int a = in.nextInt();
			System.out.println(a*a);
		}
		else
		{
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a*b);
		}

	}

}
