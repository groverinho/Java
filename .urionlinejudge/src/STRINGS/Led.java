package STRINGS;
import java.util.Scanner;
public class Led 
{
	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		int casos= in.nextInt();
	
		while (casos !=0)
		{
			String numero = in.next();
				int cont = 0;
			for (int i = 0; i < numero.length(); i++) 
			{
				if(numero.charAt(i)=='1')
					cont = cont+2;
				if(numero.charAt(i)=='2'||numero.charAt(i)=='3'|| numero.charAt(i)=='5')
					cont = cont+5;
				if(numero.charAt(i)=='4')
					cont = cont+4;
				if(numero.charAt(i)=='6' || numero.charAt(i)=='9'||numero.charAt(i)=='0')
					cont = cont+6;
				if(numero.charAt(i)=='7')
					cont = cont+3;
				if(numero.charAt(i)=='8')
					cont = cont+7;
			}
			System.out.println(cont+" leds");
			casos--;
		}	
	}
}
