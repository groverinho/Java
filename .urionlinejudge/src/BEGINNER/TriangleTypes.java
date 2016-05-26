package BEGINNER;
import java.util.Arrays;
import java.util.Scanner;


public class TriangleTypes {

	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);

		
		double V[]= new double[3];
		V[0]= in.nextDouble();
		V[1]= in.nextDouble();
		V[2]= in.nextDouble();
		double aux = 0;
		if (V[0] <V[1])
	    {
	        aux = V[0];

	        V[0] = V[1];

	        V[1] = aux;
	    }
	    if (V[1] < V[2])
	    {
	        aux = V[1];

	        V[1] = V[2];

	        V[2] = aux;
	    }
	    if (V[0]< V[1])
	    {
	        aux = V[0];

	        V[0] = V[1];

	        V[1] = aux;
	    }
	        if (V[0] >= V[1] + V[2])
	            System.out.println("NAO FORMA TRIANGULO");  
	        else if (V[0]*V[0] == (V[1]*V[1]) + (V[2]*V[2]))
	        	System.out.println( "TRIANGULO RETANGULO"); 
	        else if (V[0]*V[0] > (V[1]*V[1]) + (V[2]*V[2]))
	        	System.out.println("TRIANGULO OBTUSANGULO"); 
	        else if (V[0]*V[0] < (V[1]*V[1]) + (V[2]*V[2]))
	        	System.out.println( "TRIANGULO ACUTANGULO"); 
	          if (V[0] == V[1] && V[1] == V[2])
	        	System.out.println("TRIANGULO EQUILATERO"); 
	        else  if (V[0] == V[1] || V[1] == V[2])
	        	System.out.println( "TRIANGULO ISOSCELES"); 

	}

	}


