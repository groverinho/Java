

import java.util.Scanner;

 class izquierdaDerecha {

	public static void main(String[] args) {
		Scanner in  =new Scanner(System.in);
		int casos = in.nextInt();
	
		while (casos>0) 
		{
		casos--;
			String p = in.next();
			int maximo=0, pos=0, d=0;
			for (int i = 0; i < p.length(); i++)
			{
				if (p.charAt(i)=='?')
				d++;
				if (p.charAt(i)=='L')
				pos++;
				if (p.charAt(i)=='R')
				pos--;
				maximo=Math.max(maximo,Math.abs(pos)+d);
	//Math.max(a,b)este metodo lleva dos parametros a y b
	// y determina el mayor entre esos dos numeros
	// en este caso compara el si es mayor el "maximo" o 
	// el "Math.abs(pos)+d"
				System.out.println("max "+maximo);
			}
			System.out.println(maximo);
		}
	}

}
