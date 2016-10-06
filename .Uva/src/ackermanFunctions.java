import java.util.Scanner;


public class ackerman {

	/**
	 * Name: Grover Irusta
	   Date: 05-10-16
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			long l = in.nextInt();
			long h = in.nextInt();
			if (l == 0 && h ==0)
			{
				break;
			}
			long maximo = Math.max(l, h);
			long minimo = Math.min(l, h);
			long max = 0;
			long cont=0;
			long v=0;
			for (long x = minimo; x <=maximo; x++) {
				long xn=x;
				cont=1;
				if (xn%2==0)
				{
					xn=xn/2;
					
				}
				else
				{
					xn=(3*xn)+1;
				}
				while (xn!=1)
				{
					if (xn%2==0)
					{
						xn=xn/2;
						
					}
					else
					{
						xn=(3*xn)+1;
					}
					cont++;
				}
				
				if (cont>max)
				{
					max = cont;
					v =x;
				}
				cont=0;
			}
			System.out.println("Between "+minimo+" and "+maximo+", "+v+" generates the longest sequence of "+max+" values.");
			
		}
		
		

	}

}
