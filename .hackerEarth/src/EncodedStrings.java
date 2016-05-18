import java.math.BigInteger;
import java.util.Scanner;


public class EncodedStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = in.next();
		int index = 1;
		String aux="";
		for (int i = 0; i < cad.length(); i++) 
		{
			for (char j = 'a'; j <= 'z'; j++)
			{
				if (cad.charAt(i)==j)
				{
					aux+=index;
					break;
				}
				index++;
			}	
			index=1;
		}
		BigInteger a =new BigInteger( aux) ;

		System.out.println(a.mod(BigInteger.valueOf(6)).compareTo(BigInteger.ZERO)==0?"YES":"NO");
		

	}

}
