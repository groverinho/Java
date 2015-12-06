package BEGINNER;
import java.util.Scanner;


public class Distance {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		double distancia = in.nextDouble();
		double tiempo = distancia / 30;
		System.out.printf("%.0f",tiempo*60);
		System.out.println(" minutos");
	}

}
