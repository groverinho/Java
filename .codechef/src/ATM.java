import java.util.Scanner;


public class 	ATM{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double retiro=in.nextDouble();
		double montoCuenta = in.nextDouble();
		if (retiro % 5==0 &&( retiro+0.50)<montoCuenta)
		{
			montoCuenta = montoCuenta - retiro - 0.50;
			System.out.printf("%.2f\n",montoCuenta);
		}
		else
		{
			System.out.printf("%.2f\n",montoCuenta);
		}
	}

}