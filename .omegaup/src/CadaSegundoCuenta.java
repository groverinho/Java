import java.util.Scanner;


public class CadaSegundoCuenta {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		int n2 = in.nextInt();
		String c ="";
		if (n2>n)
		{
			c = "ADELANTAR";
		}
		else
			c = "ATRASAR";
		if (Math.abs(n-n2)==1) {
			System.out.println(c+" "+ Math.abs(n-n2)+" SEGUNDO");	
		}
		else
			System.out.println(c+" "+ Math.abs(n-n2)+" SEGUNDOS");
		

	}

}
