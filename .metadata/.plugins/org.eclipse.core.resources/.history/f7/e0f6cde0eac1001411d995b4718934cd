import java.util.Scanner;


public class Password {

	public static boolean numeros(String cadena)
	{
		if (cadena.contains("1")||cadena.contains("2")||cadena.contains("3")||cadena.contains("4")||cadena.contains("5")|| 
			cadena.contains("6")||cadena.contains("9")||cadena.contains("8")||cadena.contains("7")||cadena.contains("0"))
		{
			return true;
		}
		else
			return false;
	}
	public static boolean vocal(String cadena)
	{
		if (cadena.contains("a")||cadena.contains("e")||cadena.contains("i")||cadena.contains("o")||cadena.contains("u")||
			cadena.contains("A")||cadena.contains("E")||cadena.contains("I")||cadena.contains("O")||cadena.contains("U"))
		{
			return true;
		}
		else
			return false;
	}

	public static boolean sinRepetir(String cadena)
	{
		for (int i = 0; i < cadena.length(); i++)
		{
			if (i+1<cadena.length())
			{
				if (cadena.charAt(i)==cadena.charAt(i+1))
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String cadena = in.next();
		if (n >=12 && numeros(cadena) && vocal(cadena) && sinRepetir(cadena) ) 
		{
			System.out.println("SEGURO");
		}
		else
			System.out.println("INSEGURO");
	}

}
