package ADHOC;
import java.util.Scanner;
class  AlarmClock2
{
   public static void main(String[] args) 
   {
      Scanner entrada = new Scanner(System.in);
      int h1 = 1;
      int m1 = 1;
      int h2 = 1;
      int m2 = 1;
      int r1 = 0;
      int r2 = 0;
      int total = 0;
      while(h1!=0 && m1!=0 || h2!=0 && m2!=0){
         h1 = entrada.nextInt();
         m1 = entrada.nextInt();
         h2 = entrada.nextInt();
         m2 = entrada.nextInt();
         if ( h1>-1 && h1<24){
            if ( m1>-1 && m1<60){
               if ( h2>-1 && h2<24){
                  if ( m2>-1 && m2<60){
                     r1 = (h1*60)+m1;
                     r2 = (h2*60)+m2;
                     total = r2-r1;
                     if(total < 0){
                        total = total + 1440;
                     }
                  }
               }
            }
            System.out.println(total);
         }else {
         }
      }
   }
}
/*import java.util.Scanner;
public class AlarmClock 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int h1 = in.nextInt(), m1 = in.nextInt(),h2 = in.nextInt(), m2 = in.nextInt();
		while(h1!=0 && m1!=0 || h2!=0 && m2!=0)
		{
			int minutos=0;
			if(h1==23)
			{
				h1=-1;
				for (int i = h1; i < h2; i++)
				{	
					for (int j = m1; j < 60; j++)
						minutos++;				
					m1=0;
				}
				System.out.println(minutos+m2);
			}
			else if (h1==h2)
			{
				if(m1>m2)
				{
					for (int i = h1; i < 24; i++) 
						minutos=minutos+60;
					h1=0;
					for (int i = h1; i < h2; i++)
					{	
						for (int j = m1; j < 60; j++)
							minutos++;				
						m1=0;
					}
					System.out.println(minutos+m2);
				}
				else
					System.out.println(m2-m1);
			}
			else
			{
				for (int i = h1; i < h2; i++)
				{	
					for (int j = m1; j < 60; j++)
						minutos++;				
					m1=0;
				}
				System.out.println(minutos+m2);
			}
			
			h1 = in.nextInt(); m1 = in.nextInt();h2 = in.nextInt(); m2 = in.nextInt();
		}
	}
}*/

