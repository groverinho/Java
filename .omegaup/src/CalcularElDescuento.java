import java.util.Scanner;


public class CalcularElDescuento {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		if (n>1000)
		{
			int aux = (n * 15)/100;
			System.out.println(n-aux);
		}
		else
			System.out.println(n);

	}

}
