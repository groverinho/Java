package BEGINNER;
import java.util.Scanner;


public class Area {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// triangulo = a * c / 2
		//circulo = 3.14159 * c^2
		//TRAPEZIO =(a + b * c) / 2
		//cuadrado = b*b
		//rectangulo =a *b
		double a= in.nextDouble(), b = in.nextDouble(),c= in.nextDouble();
		System.out.printf("TRIANGULO: %.3f\n",(a * c) / 2);
		System.out.printf("CIRCULO: %.3f\n",3.14159 * Math.pow(c, 2));
		System.out.printf("TRAPEZIO: %.3f\n",((a + b) * c) / 2);
		System.out.printf("QUADRADO: %.3f\n",b*b);
		System.out.printf("RETANGULO: %.3f\n",a*b);
	}
}
 /*
  * 
  * TRIANGULO: 7.800 
CIRCULO: 84.949 
TRAPEZIO: 18.200 
QUADRADO: 16.000 
RETANGULO: 12.000*/

