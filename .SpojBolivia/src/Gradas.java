
import java.util.Scanner;


 class Gradas {
	 public static String cadena = "";
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n=0;
	
		while(n!=-1)
		{
			n = in.nextInt();
			if ((n!=-1)) 
				cadena = cadena+ ((n*2)+1)+"\n";		
		}
		System.out.print(cadena);
	}

}
