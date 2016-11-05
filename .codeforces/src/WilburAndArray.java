import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 05-11-16
 */

public class WilburAndArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int v[] = new int[n];
        for(int i=0;i<n;i++) 
            v[i] = in.nextInt();
        
        long pasos = 0, actual = 0;
        for(int i=0;i<n;i++) 
        {
            pasos += Math.abs(v[i] - actual);
            actual += (v[i] - actual);
        }
        System.out.println(pasos);

	}

}
