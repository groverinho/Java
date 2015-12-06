
import java.util.Scanner;


 class Bits {
	
	public static void main(String[] args) 
	{
		Scanner entrada= new Scanner(System.in);
		int n=0;
		while(true)
		{
			n = entrada.nextInt();
			if (n==0)
				break;
			int c = (int) (Math.log(n)/Math.log(2)+1);
			System.out.println(c);
		}
	}
}
