package ADHOC;

import java.util.Scanner;

public class NumberFrequence {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int vec []= new int [2001]; 
	for (int i = 0; i < n; i++) 
	{
		int index = in.nextInt();
		vec[index]++;
	}
	for (int i = 0; i < vec.length; i++) {
		if (vec[i]!=0)
		{
			System.out.println((i)+" aparece "+vec[i]+" vez(es)");
		}
	}
	}

}
