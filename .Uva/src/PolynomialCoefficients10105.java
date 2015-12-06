	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	
	public class PolynomialCoefficients10105 {
	
	    public static void main(String[] args) throws IOException
	    {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        StringBuffer cad = new StringBuffer("");
	        String m="";
	        long[] fact = new long[14];
	        fact[0] = 1;
	        fact[1] = 1;
	        for (int i = 2; i < fact.length; i++) 
	            fact[i] = fact[i - 1]*i;
	        
	        while((m=in.readLine())!=null)
	        {
	            String[]vec=m.split(" ");
	            int n=Integer.parseInt(vec[0]);
	            int k=Integer.parseInt(vec[1]);
	            vec=in.readLine().split(" ");
	            long aux=fact[n];
	            for(int i=0;i<k;i++)
	            {
	                int div=Integer.parseInt(vec[i]);
	                if(div>1)
	                    aux/=fact[div];
	            }
	            cad.append(aux).append("\n");
	        }
	        System.out.print(cad);
	    }
	}