import java.util.Scanner;


public class clockHands579 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);		
		String cadena = in.next();
		String [] reloj = new String[2];
		reloj = cadena.split(":");
		int hora = Integer.parseInt(reloj[0]);
		int minuto = Integer.parseInt( reloj[1]);
		while (hora !=0 || minuto !=0)
		{
			double resp =Math.abs(0.5*((hora*60)-(minuto*11)));
			if (resp>180)
			{	
				System.out.printf("%.3f\n",(360-resp));	
			}
			else
				System.out.printf("%.3f\n",(resp));
			cadena = in.next();
			reloj = cadena.split(":");
			 hora = Integer.parseInt(reloj[0]);
			 minuto = Integer.parseInt( reloj[1]);
		}
		
		
	}

}
