import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class TiroconArco2 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c=0;
		while (n-->0)
		{
			double tiro = in.nextDouble();
//			if (tiro>-1 && tiro<=1) {
//			
//			}
			/*else */if (tiro>-1&& tiro<=1) {
				c+=10;
			}
			else if (tiro>1&& tiro<=2) {
				c+=9;
			}
			else if (tiro>2&& tiro<=4) {
				c+=8;
			}
			else if (tiro>4&& tiro<=6) {
				c+=7;
			}
			else if (tiro>6&& tiro<=9) {
				c+=6;
			}
			else if (tiro>9&& tiro<=14) {
				c+=5;
			}
			else if (tiro>14&& tiro<=19) {
				c+=4;
			}
			else if (tiro>19&& tiro<=25) {
				c+=3;
			}
			else if (tiro>25 && tiro <=31) {
				c+=2;
			}
			else if (tiro>31 && tiro <=38) 
				c+=1;
		}
		System.out.println(c);
	}

}
