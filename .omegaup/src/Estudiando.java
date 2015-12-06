import java.util.Scanner;
public class Estudiando 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int suma = in.nextInt();
		int resta = in.nextInt();
		int multiplicacion = in.nextInt();
		int division = in.nextInt();
		int modulo = in.nextInt();
		boolean bandera = false;
		String cadena = "";
		for (int i = 1; i <= 5; i++) 
		{
			switch (i) 
			{
				case 1:
					if ((a+b)!= suma)
						bandera = true;
					cadena = cadena + (a+b)+ "\n";
					break;
				case 2:
					if ((a-b)!= resta)
						bandera = true;
					cadena = cadena + (a-b)+ "\n";
					break;
				case 3:
					if ((a*b)!= multiplicacion)
						bandera = true;
					cadena = cadena + (a*b)+ "\n";
					break;
				case 4:
					if ((a/b)!= division)
						bandera = true;
					cadena = cadena + (a/b)+ "\n";
					break;
				case 5:
					if ((a%b)!= modulo)
						bandera = true;
					cadena = cadena + (a%b);
					break;
			}
		}
		if (!bandera) 
			System.out.println("\"Correcto\"");
		else
		{
			System.out.println("\"Incorrecto\"");
			System.out.print(cadena);
		}		
	}
}