package BEGINNER;
import java.util.Scanner;
public class Sphere {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		double t = (4.0 * 3.14159 *Math.pow(r,3))/3;
		System.out.print("VOLUME = ");
		System.out.printf("%.3f\n",t);
		
	}
}