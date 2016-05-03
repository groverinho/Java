package ADHOC;

import java.util.Scanner;

public class GuessWhat {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		
		int casos  = in.nextInt();
		while (casos-->0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int vector [] = new int [n];
			int aux=100;
			int index = 0;
			for (int i = 0; i < vector.length; i++) 
			{
				vector[i] = in.nextInt();
				if (Math.abs(vector[i]-m)<aux) 
				{
					index = i;
					aux = Math.abs(vector[i]-m);
				}
			}
			System.out.println(index+1);
			
		}

	}

}
