
import java.util.Scanner;
class ColaPrimos2 {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int divisor1=2;
		boolean bandera1=false;
		int divisor=2;
		boolean bandera=false;
	   int n;
	   int q;
	   n= in.nextInt();
		int Entrada[] = new int[n];
	    for (int i = 0; i < Entrada.length; i++) 
	    {
	    	Entrada[i] = in.nextInt();
	    }
	    q = in.nextInt();
	    for (int i = 0; i < Entrada.length; i++) 
	    {
	    	if(q == Entrada[Entrada.length-1] || q == Entrada[0])
	    	{
	    		System.out.println("No");
	    		break;
	    	}
	    	else if(q == Entrada[i])
	    	{   			
			    		while(!bandera1 && divisor1<Entrada[i-1])
			    		{ 
					    		if (Entrada[i-1]%divisor1==0)
					    		bandera1=true;
					    		
					    		divisor1++;
			    		}
			    		while(!bandera && divisor<Entrada[i+1])  
			    		{ 
					    		if (Entrada[i+1]%divisor==0)
					    		 bandera=true;  
					    		
					    		divisor++; 
			    		}
			    		
			    		if (!bandera1 && !bandera)
			    		System.out.println("Yes");
			    		else
			    		System.out.println("No");
			    		break;
    			}
	    }   	 
	 }
}

