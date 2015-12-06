package BEGINNER;
import java.util.Arrays;
import java.util.Scanner;


public class TriangleTypes {

	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		while (in.hasNextDouble()) {
			
		
		double V[]= new double[3];
		V[0]= in.nextDouble();
		V[1]= in.nextDouble();
		V[2]= in.nextDouble();
	      //  Arrays.sort(V);

	        if (V[0] > V[1] + V[2])
	            System.out.println("NAO FORMA TRIANGULO");  
	        if (V[0]*V[0] == V[1]*V[1] + V[2]*V[2])
	        	System.out.println( "TRIANGULO RETANGULO"); 
	        if (V[0]*V[0] > V[1]*V[1] + V[2]*V[2])
	        	System.out.println("TRIANGULO OBTUSANGULO"); 
	        if (V[0]*V[0] < V[1]*V[1] + V[2]*V[2])
	        	System.out.println( "TRIANGULO ACUTANGULO"); 
	        if (V[0] == V[1] && V[1] == V[2])
	        	System.out.println("TRIANGULO EQUILATERO"); 
	        if (V[0] == V[1] || V[1] == V[2]|| V[0] == V[2])
	        	System.out.println( "TRIANGULO ISOSCELES"); 
	    }
	}

	}


