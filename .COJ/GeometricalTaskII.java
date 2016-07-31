import java.util.Scanner;


public class GeometricalTaskII {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = in.next();

		if (cad.equals("circle")) 
		{
			double n = in.nextDouble();
			System.out.printf("%.2f\n", (3.14*Math.pow(n, 2)));
		}
		else if (cad.equals("triangle")) 
		{
			double n = in.nextDouble();
			double b = in.nextDouble();
			System.out.printf("%.2f\n", (n*b/2));
		}
		else
		{
			double n = in.nextDouble();
			double b= in.nextDouble();
			System.out.printf("%.2f\n", (n*b/2));
		}
	}

}
