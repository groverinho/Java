import java.util.Scanner;
 class hash {
	public static int numeroAlfabeto(Character palabra)
	{
		 int i=-1;
		   for (char letra = 'A'; letra <= 'Z'; letra++) 
		   {
			   i++;
			   if (palabra == letra) 
				  break;
		   }
		 return i;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine())
		{
			String cadena = in.nextLine();
			String [] textElements = cadena.split(" ");
			int resul=0, abecedario = 0;
			for (int i = 0; i < textElements.length; i++) 
			{	
				String aux = textElements[i];			
				for (int j = 0; j < aux.length(); j++) 
				{
					resul = resul + i+ j;
					abecedario= abecedario + numeroAlfabeto(aux.charAt(j));
				}
			}
				System.out.println(resul+abecedario);
		}
	}
}