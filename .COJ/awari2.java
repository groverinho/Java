/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 17-10-16
 */

import java.util.Scanner;

public class awari2 {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			if (n ==-1) {
				break;
			}
			int vector[]= new int [n];
			int index=-1;
			int banderab = 0;
			boolean bandera = false;
			for (int i = 0; i <n ; i++)
			{
				vector[i]= in.nextInt();
				
			}
			int x = 0;
			for (int i = 0; i < vector.length; i++) {
				x = vector[i];
				if (x ==i+1)
				{
					for (int j = 0; j < i; j++) {
						vector[j]++;
					}
					vector[i]=0;
					i=-1;
				}
			}
			for (int i = 0; i < vector.length; i++) {
				if (vector[i]==0) 
					banderab++;
			}
		
				
			
			System.out.println(banderab==vector.length?"S":"N");
			
		}
		

	}

}
