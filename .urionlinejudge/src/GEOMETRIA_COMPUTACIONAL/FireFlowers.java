package GEOMETRIA_COMPUTACIONAL;

import java.util.Scanner;

public class FireFlowers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			double r1, x1,y1,r2,x2,y2;
			r1= in.nextDouble();
			x1= in.nextDouble();
			y1= in.nextDouble();
			r2= in.nextDouble();
			x2= in.nextDouble();
			y2= in.nextDouble();
			  double distancia = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));//distancia entre dos puntos
		      if (distancia + r2 <= r1)
		        System.out.println("RICO");
		      else
		    	  System.out.println("MORTO");

		}
		
	}

}
