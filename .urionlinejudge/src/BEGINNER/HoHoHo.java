package BEGINNER;

import java.util.Scanner;

public class HoHoHo {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++)
		{if(i+1 == n)
			System.out.print("Ho") ;
        else
        	System.out.print( "Ho ") ;}

		System.out.println("!");
	}

}
