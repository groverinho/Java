import java.util.Arrays;
import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class conjuntoPermutado {

	/**
	 * @param args
	 */
	public static boolean verifica(int[]v1,int[]v2)
	{
		for (int i = 0; i < v2.length; i++) {
			if (v1[i]!=v2[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int v1 []= new int [n];
	int v2 []= new int [n];
	for (int i = 0; i < n; i++) {
		v1[i]=in.nextInt();
	}
	for (int i = 0; i < n; i++) {
		v2[i]=in.nextInt();
	}
	Arrays.sort(v1);
	Arrays.sort(v2);
	System.out.println(verifica(v1, v2)?"SI":"NO");
	
	}

}
