import java.util.Scanner;


public class CompleteString {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		for (int i = 0; i < casos; i++) 
		{
			String cadena = in.next();
			boolean bandera = true;
			for (int j = 0; j < cadena.length(); j++)
			{
				if(cadena.contains("a")&&cadena.contains("b")&&cadena.contains("c")&&cadena.contains("d")&&
				   cadena.contains("e")&&cadena.contains("f")&&cadena.contains("g")&&cadena.contains("h")&&
				   cadena.contains("i")&&cadena.contains("j")&&cadena.contains("k")&&cadena.contains("l")&&
				   cadena.contains("m")&&cadena.contains("n")&&cadena.contains("o")&&cadena.contains("p")&&
				   cadena.contains("q")&&cadena.contains("r")&&cadena.contains("s")&&cadena.contains("t")&&
				   cadena.contains("u")&&cadena.contains("v")&&cadena.contains("w")&&cadena.contains("x")&&
				   cadena.contains("y")&&cadena.contains("z"))
				{
					bandera = false;
				}
			}
			if (bandera==true) 
				System.out.println("NO");	
			else
				System.out.println("YES");
		}
	}
}