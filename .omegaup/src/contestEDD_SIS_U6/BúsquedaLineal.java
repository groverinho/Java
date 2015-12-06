package contestEDD_SIS_U6;

import java.util.Scanner;

public class BúsquedaLineal {

	public static void main(String[] args) {
		Scanner in  =new Scanner(System.in);
		int n = in.nextInt();
		int []vec = new int [n];
		
		for (int i = 0; i < vec.length; i++) {
			vec[i]= in.nextInt();
		}
		int query = in.nextInt();
		boolean band = false;
		for (int i = 0; i < vec.length; i++) {
			if (query ==vec[i]) {
				band = true;
				break;
			}
		}
		if (band) {
			System.out.println("Si");
		}
		else
			System.out.println("No");
	}

}
