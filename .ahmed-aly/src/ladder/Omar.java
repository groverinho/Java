package ladder;

import java.util.Scanner;

public class Omar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		while (casos>0)
		{
			int a = entrada.nextInt();
			int b = entrada.nextInt();
			System.out.println(a+b);
			casos--;
		}
	}

}
