import java.util.Scanner;


public class obtenerPromedio {
	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		double n = in.nextDouble();
		double[]vector = new double [(int) n];
		double acu = 0;
		for (int i = 0; i < n; i++) {
			vector[i]= in.nextInt();
			acu+=vector[i];
		}
		System.out.printf("%.2f\n",(acu/n));
	}
}
