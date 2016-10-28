import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 27-10-16
 */

public class SimpleBaseConversion10473 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		 while (in.hasNext()) {
	            String num = in.next();

	            if (num.length() >= 2 && num.subSequence(0, 2).equals("0x"))
	                System.out.println(Integer.valueOf(num.substring(2, num.length()), 16));
	            else if (num.charAt(0) == '-') break;
	            else
	                System.out.println("0x" + Integer.toHexString(Integer.parseInt(num)).toUpperCase());
	        }

	}

}
