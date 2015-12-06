package BEGINNER;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 class OddNumbers {

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
		int [] vector = new int [n]; 
		for (int i = 0; i <= vector.length-1; i++) 
		{
			vector[i]=i+1;
			 a = vector[i];
			if (verificar(a))
			{
				System.out.println(a);
			}
		
		}
	
		
	}
}
