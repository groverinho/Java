import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 

public class EtruscanWarriorsNeverPlayChess11614 {
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong() ;
		
		while(n>0){
			
		long soldados =  in.nextLong();
		
		long fila =(long) ((Math.sqrt(1+8*soldados)-1)/2);

		System.out.println(fila);
		
		n--;
		
		}
	}
}
