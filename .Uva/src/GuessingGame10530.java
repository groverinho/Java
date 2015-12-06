import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GuessingGame10530
{
	  
	  public static void main(String[] args) throws IOException 
	  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(in.readLine()) ;
	    while (n != 0) 
	    {
	      int arriba = 10;
	      int bajo = 1;
	      String estado = in.readLine();
	      while (!estado.equals("right on"))
	      {
		        if (estado.equals("too high")) 
		        {
		          arriba = Math.min(arriba, n - 1);
		        }
		        else
		        {
		          bajo = Math.max(bajo, n + 1);
		        }
		        n =Integer.parseInt(in.readLine()) ;
		        estado = in.readLine();
	      }

	      if (n >= bajo && n <= arriba) 
	      {
	        System.out.println("Stan may be honest");
	      } 
	      else 
	      {
	        System.out.println("Stan is dishonest");
	      }

	      n = Integer.parseInt(in.readLine()) ;
	    }
	  }
	}