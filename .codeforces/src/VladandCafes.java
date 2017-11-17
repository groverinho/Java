import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - Mojix
Date /2017
 */
public class VladandCafes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] vect = new int [n];
        for (int i = 0; i < vect.length; i++) {
			vect[i] = in.nextInt();
		}
        boolean[] v = new boolean[200001];
        int resp = -1;
        for(int i = n-1; i >= 0; i--) {
            if (!v[vect[i]]) {
                resp = vect[i];
                v[vect[i]] = true;
            }
        }
        System.out.println(resp);
	}

}
