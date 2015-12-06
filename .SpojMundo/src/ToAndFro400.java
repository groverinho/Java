

import java.util.Scanner;

 class ToAndFro400 {
/*Input:
5
toioynnkpheleaigshareconhtomesnlewx
3
ttyohhieneesiaabss
0
Output:
theresnoplacelikehomeonasnowynightx
thisistheeasyoneab*/
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		while (n!=0)
		{
			String cadena = in.next();
			int l = cadena.length();
			int m = l/n;
			algo(cadena, n,  m);
			n = in.nextInt();
		}
	}
	public static void algo(String cadena, int n, int m)
	{
		char [][] matriz = new char[m][n];
		int contLetra=0;
		int jota=0;
		boolean bandera = true;
			for (int i = 0; i < matriz.length; i++)
			{
				if (bandera==true)
				{
					while(jota<n)
					{
						matriz[i][jota]=cadena.charAt(contLetra);
						//System.out.println("matriz["+i+"]["+jota+"]"+matriz[i][jota]);
						contLetra++;
						jota++;	
					}
					bandera=false;
					jota--;
				}
				else
				{
					while (jota>=0) 
					{
						matriz[i][jota]=cadena.charAt(contLetra);
						//System.out.println("matriz["+i+"]["+jota+"]"+matriz[i][jota]);
						contLetra++;
						jota--;
					}
					bandera=true;
					jota++;
				}
			}
			String cad="";
			for (int i = 0; i < n; i++) 
				for (int j = 0; j < m; j++) 
					cad = cad + matriz[j][i];
			System.out.println(cad);
	}	
}