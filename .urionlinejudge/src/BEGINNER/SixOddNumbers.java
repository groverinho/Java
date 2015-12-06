package BEGINNER;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SixOddNumbers {

	public static Boolean verificar(int  n)
    {
        if (n == 1)
            return true;
        else
        {
                if (n % 2 == 0)
                    return false;
        }
        return true;
    }
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
		int a=0;
			
		
		int n = Integer.parseInt(entrada.readLine());
		int [] vector = new int [n+12]; 
		for (int i = 0; i <n+12; i++) 
		{
			vector[i]=i;
			 a = vector[i];
			 if (a>=n) {
				
			
			if (verificar(a))
			{
				System.out.println(a);
			}
			 }
		
		}
	}

}
