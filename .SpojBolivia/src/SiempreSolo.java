

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 class SiempreSolo 
{
	public static  int resolver(char[]cadena, int n )
	{
	    boolean igual;
	    int i;
	    for( i=0; i<n; i++ )
	    {
	        igual = false;
	        for(int j = 0; j<n; j++ )
	        {
	            if(cadena[i]==cadena[j] && i!=j)
	             {
	                 igual = true;
	            }
	        }
	        if( igual == false )
	        {
	            return i+1;
	        }  
	    }
	    return 0;
	}
	public static void main(String[] args) throws IOException
	{ 
		BufferedReader entrada = new BufferedReader(
				new InputStreamReader(System.in));
		int n= 1;
		while (n!=0)
		{
			n= Integer.parseInt(entrada.readLine());
			if (n==0)
				break;
			String cadena = entrada.readLine();
			char[] char1 = new char[cadena.length()];
			for (int i = 0; i < cadena.length(); i++) 
			{
				char1[i]= cadena.charAt(i);
			}			
			System.out.println(resolver(char1, n));
		}
	}
/*
 * 6
AAAaAA
4
aaae
0*/
}
