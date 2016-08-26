import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date:25-08-16 

public class ReversedBinaryNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		StringBuilder cad = new StringBuilder(Integer.toBinaryString(n)+"");
		cad = cad.reverse();
		
		long  r = Long.parseLong(cad.toString(), 2);
		System.out.println(r); 

		

	}

}
