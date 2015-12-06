import java.util.Scanner;


public class AngryBirds {

	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		int c=0;
		String cadena ;
		 try {
				while ((cadena=in.next())!=null) 
				{
					if (cadena.equals("ooo"))
					{
						c = c+3;
					}
					else if (cadena.equals("oo-"))
					{
						c = c+2;
					}
					else  if (cadena.equals("o--"))
					{
						c = c+1;
					} 
				}
				 
			}
		 catch (Exception e) {	}
		 System.out.println(c);
	}

}
