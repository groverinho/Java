import java.util.Scanner;


public class Deuda {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int debe = in.nextInt();
		int pagos = in.nextInt();
		int acu = 0;
		for (int i = 0; i < pagos; i++)
		{
			int cuota = in.nextInt();
			acu = acu + cuota;
		}
		System.out.println(debe-acu);
	}

}
