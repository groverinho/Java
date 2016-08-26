import java.util.ArrayList;
import java.util.Scanner;
//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 25-08-16
public class zanzibar {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			int sum = 0;
			ArrayList<Integer> lista  = new ArrayList<Integer>();
			while (true)
			{
				int n = in.nextInt();
				if (n==0) {
					break;
				}			
				lista.add(n);
			}
			for (int i = 0; i < lista.size()-1; i++) {
				if ((lista.get(i)*2)<lista.get(i+1) ) {
					sum += lista.get(i+1) - (lista.get(i)*2);
				}
				
			}
			System.out.println(sum);
		}

	}

}
/*

*/