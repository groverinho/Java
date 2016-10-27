import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 26-10-16
 */

public class GroupReverse1177 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true)
		{
			int casos = in.nextInt();
			if (casos==0) {
				break;
			}
			  String x = in.next();
			  StringBuilder cad = new StringBuilder();
			  String c="";
			  casos = x.length()/casos;
		//	  System.out.println("tam "+ x.length());
			  for (int i = 0; i < x.length(); i++)
			  {
				  int aux=0;
				  cad = new StringBuilder();
				  while (i<x.length() && aux<casos)
				  {
					cad.append(x.charAt(i));
					i++;
					aux++;
				}
				  i--;
				  cad = cad.reverse();
				  c += cad+"";
			}
			  System.out.println(c);
		}

	}

}
