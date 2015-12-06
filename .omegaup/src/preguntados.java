import java.applet.AudioClip;
import java.util.Scanner;


public class preguntados {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int auxC=0; int auxI=0;
		while (casos>0)
		{
			
			
			int correcta = in.nextInt();
			int incorrecto = in.nextInt();
			
			auxC += correcta;
			auxI+=incorrecto;
			casos--;
		}
		if (auxC>auxI)
		{
		System.out.println("CULTO");	
		}
		else if (auxI>auxC) {
			System.out.println("INCULTO");
		}
		else if (auxC==auxI) {
			System.out.println("INDETERMINADO");
		}
			
	}
	

}
