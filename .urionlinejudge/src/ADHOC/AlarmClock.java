package ADHOC;
import java.util.Scanner;


public class AlarmClock {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int h1,m1,h2,m2;
		while(entrada.hasNextInt())
		{
			do
			{
				h1 = entrada.nextInt();
				m1 = entrada.nextInt();
				h2 = entrada.nextInt();
				m2 = entrada.nextInt();
				int total1 =0,total2=0,total=0;
				if(h1==0&&m1==0&&h2==0&&m2==0)
					break;
				if(h1==0&&h2==0)
					h1=0;
				else if(h2==0)
					h2=24;
				else if(h1==0)
					h1=24;
					total1 = (h1*60)+m1;
					total2 = (h2*60)+m2;
					total = total2-total1;
					if(total<0)
					{
						System.out.println(1440+total);
					}
					else
					{
						System.out.println(total);
					}				
			}while(h1!=0&&m1!=0&&h2!=0&&m2!=0);
		}
	}
}
