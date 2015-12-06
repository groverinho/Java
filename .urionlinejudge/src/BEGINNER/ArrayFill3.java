package BEGINNER;

import java.util.Scanner;

public class ArrayFill3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double N[]= new double [100];
	    int i=0;
	    N[0]= in.nextDouble();
	    System.out.print("N["+i+"] = ");
	    System.out.printf("%.4f\n",N[i]);
	    for( i=1; i<=99; i++){
	        N[i] = N[i-1]/2;
	        System.out.print("N["+i+"] = ");
		    System.out.printf("%.4f\n",N[i]);
	    }
	}
}
