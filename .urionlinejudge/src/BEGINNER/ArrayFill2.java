package BEGINNER;

import java.util.Scanner;

public class ArrayFill2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int N[]= new int[1000];
		 int t, i, x=0;
		 t = in.nextInt();
		    for(i=0; i<=999; i++){
		        N[i]=x;
		        x++;
		        if(x==t){ x=0;}
		        System.out.println("N["+i+"] = "+N[i]);
		    }


	}

}
