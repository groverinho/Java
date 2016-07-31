import java.math.BigInteger;
import java.util.Scanner;


public class youCanSay11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String N = in.next();
		while (!N.equals("0"))
		{
			
		BigInteger m = new BigInteger(N.toString());
		//if (N%11==0)
		BigInteger aa =m.mod(BigInteger.valueOf(11));
		if(aa.compareTo(BigInteger.valueOf(0))==0)
		{
			System.out.println(N+" is a multiple of 11.");
		}
		else
			System.out.println(N+" is not a multiple of 11.");
		 N = in.next();
		}
	}

}
