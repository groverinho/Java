import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 30-10-16
 */

public class RomaandLuckyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int  n= in.nextInt();
	int  k= in.nextInt();
	int c =0,c2=0;
	for (int i = 0; i < n; i++) 
	{
		c2=0;
		int aux = in.nextInt();
		String cad = aux+"";
		for (int j = 0; j < cad.length(); j++) {
			if (cad.charAt(j)=='7'||cad.charAt(j)=='4')
			{
				c2++;
			}
		}
		if (c2<=k) {
			c++;
		}
		
	}
	System.out.println(c);
	

	}

}
