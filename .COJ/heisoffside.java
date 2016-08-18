import java.util.Arrays;
import java.util.Scanner;
// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 13-08-16

 class heisoffside 
{
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		int a = in.nextInt(), d = in.nextInt();
		while (a !=0 && d !=0) {
			
		
		int[]vectora = new int[a];
		int[]vectord = new int[d];
		for (int i = 0; i < a; i++) 
			vectora[i]= in.nextInt();
		for (int i = 0; i < d; i++) 
			vectord[i]= in.nextInt();
		Arrays.sort(vectora);
		Arrays.sort(vectord);
		if (vectora[0]<vectord[1])
			System.out.println("Y");
		else
			System.out.println("N");
		a = in.nextInt(); d = in.nextInt();
		}
	}
}
