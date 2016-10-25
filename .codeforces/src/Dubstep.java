import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 20-10-16
 */

public class Dubstep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = in.next();
		cad = cad.replaceAll("WUB"," ");
//		for (int i = 0; i <cad.length() ; i++)
//		{
//			if (i+2<cad.length())
//			{
//				if (cad.charAt(i)=='W'&& cad.charAt(i+1)=='U'&&cad.charAt(i+2)=='B')
//				{
//					
//				}
//			}
//		}
		cad = cad.trim();
		System.out.println(cad);

	}

}
