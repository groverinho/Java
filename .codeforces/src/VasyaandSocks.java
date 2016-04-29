import java.util.Scanner;


public class VasyaandSocks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int calcetines = in.nextInt();
		int diasCompra = in.nextInt();
		int c=0;
		int i =0;
		while(calcetines>0)
		{
			c++;
			i++;
			calcetines--;
			if (i==diasCompra)
			{
				i=0;
				calcetines++;
			}
			
		}
System.out.println(c);
	}

}
