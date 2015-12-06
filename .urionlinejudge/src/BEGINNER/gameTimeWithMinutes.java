package BEGINNER;
import java.util.Scanner;


public class gameTimeWithMinutes {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int h1,m1,h2,m2;
		while(entrada.hasNext())
		{
	
				h1 =entrada.nextInt();
				m1 =entrada.nextInt();
				h2 =entrada.nextInt();
				m2 =entrada.nextInt();
				int total1 =0,total2=0,total=0;
				if(h1==0&&h2==0)
					h1=0;
				else if(h2==0)
					h2=24;
				else if(h1==0)
					h1=24;
					total1 = (h1*60)+m1;
					total2 = (h2*60)+m2;
					total = total2-total1;
					int aux=0;
					if(total<0)
					{
						 aux =1440+total;
					}
					else
					{
						aux = total;
					}				
			
					int hora =0, minuto = 0;
					while (total>=3600)
					{
						aux = aux -3600;
						hora++;
					}
					while(aux>=60)
					{
						aux = aux-60;
						minuto++;
					}//O JOGO DUROU 1 HORA(S) E 39 MINUTO(S)
					System.out.println("O JOGO DUROU "+minuto +" HORA(S) E "+aux+" MINUTO(S)");
		}
	}
}