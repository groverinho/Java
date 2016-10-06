package STRINGS;
import java.util.Scanner;

/**
 * Name: Grover Irusta
   Date: 05-10-16
 */

public class ChristmasTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
	
			int n = in.nextInt();
			int altura = (n+1)/2;
		//	StringBuilder asteriscos = new StringBuilder();
		//	StringBuilder filas [ ]= new StringBuilder [altura];
			for (int i = 0, t=1; i <altura; i++, t+=2)
			{
				for (int j = altura - 1 - i; j > 0; j--) {
					System.out.print(" ");
				}
				for (int t2 = t; t2 > 0; t2--)
				{
					System.out.print("*");
				}
				System.out.println();
			//	filas[i]= asteriscos;
			//	asteriscos = new StringBuilder();
			}
			for (int i = 0; i < altura-2 ; i++) {
				System.out.print(" ");
				
			}
			System.out.print(" *");
			System.out.println();
			for (int i = 0; i < altura-2 ; i++) {
				System.out.print(" ");
				
			}
			System.out.print("***");
			System.out.println();
		System.out.println();
		}	

			
		
	}

}
