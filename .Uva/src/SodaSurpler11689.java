import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 23-08-16 

public class SodaSurpler11689 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			int e = in.nextInt();
			int f = in.nextInt();
			int c= in.nextInt();
			e += f;
		   int resultado = 0,  aux = 0;
		    while (e >= c) 
		    {
		    	aux = e / c;
		    	resultado += aux;
			      e %= c;
			      e += aux;
		    }
		    System.out.println(resultado);

		}
	}

}
