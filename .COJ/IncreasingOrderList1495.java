import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 16-08-16
public class IncreasingOrderList1495 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			lista.add(in.nextInt());
		}
		Collections.sort(lista);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

	}

}
