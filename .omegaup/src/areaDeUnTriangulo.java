import java.util.Scanner;


public class areaDeUnTriangulo {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		double b = in.nextInt();
		double h = in.nextInt();
		System.out.printf("%.2f\n",((b*h)/2));

	}

}
