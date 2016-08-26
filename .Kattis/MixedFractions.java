// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 2015-06-20


	import java.util.Scanner;


	public class MixedFractions {
	    public static String func(int n, int d ) {
	        int a = n / d;
	        int b = n %d;
	        if (a!=0)
	            return (a + " " + b + " / " + d);
	        else
	            return  (a + " " +b + " / " + d);
	    }
	    public static void main(String[] args) 
	    {
	        // TODO Auto-generated method stub
	        Scanner in = new Scanner(System.in);
	        
	        int n = in.nextInt();
	        int d = in.nextInt();
	        while (n!=0 && d!=0) {
	            System.out.println(func(n,d));
	        
	         n = in.nextInt();
	         d = in.nextInt();
	}

	    
	    }

	}
