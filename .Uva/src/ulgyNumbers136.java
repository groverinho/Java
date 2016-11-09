/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 18-10-16
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ulgyNumbers136 {

	static boolean isUgly(int n){
		while (n % 2 == 0)
			n /= 2;
		while (n % 3 == 0)
			n /= 3;
		while (n % 5 == 0)
			n /= 5;
		return n == 1;
	}

	public static void main(String[] args) {
		//859963392
		
		Scanner in=new Scanner(System.in);

//		int c=0;
//		int i = 1;
//				while (c!=1500)
//				{
//					if (isUgly(i)) {
//						c++;
//						System.out.println(i);
//					}
//					i++;
//					
//				}				
        System.out.println("The 1500'th ugly number is "+859963392+".");		
					
		
		
		
	}
}
