
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class SummingDigits11332 {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		  int aux;
		  int n=0;

		  while (true) 
		  {
			  n = Integer.parseInt(in.readLine());
			  if (n == 0)
					break;
			  else if(n%9==0)
					aux=9;
				else
					aux=n%9;
		  System.out.println(aux);
		    
		   
		  }


	}

}

