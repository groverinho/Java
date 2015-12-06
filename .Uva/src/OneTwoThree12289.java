import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;


public class OneTwoThree12289 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(entrada.readLine());


		while(casos>0)
		{
			String palabra = entrada.readLine();
			if (palabra.length()==5)
				System.out.println(3);
			else
			{	
				String uno = "one";
				String dos = "two";
				int c1=0, c2=0;
				for (int i = 0; i < 3; i++) 
				{
					if (palabra.charAt(i)==uno.charAt(i))
						c1++;
					else if (palabra.charAt(i)==dos.charAt(i))
						c2++;
				}
				if (c1>c2) 
					System.out.println(1);
				else
					System.out.println(2);
			}	
			//palabra = entrada.readLine();
			
			casos--;
			
		}

	}

}
