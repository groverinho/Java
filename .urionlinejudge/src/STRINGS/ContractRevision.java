/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 21/05/2018
 */
package STRINGS;

import java.math.BigInteger;
import java.util.Scanner;

public class ContractRevision {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int d=in.nextInt();
			String n=in.next();
			if (d==0 && n.equals("0")) {
				break;
			}
			n = n.replaceAll(d+"", "");
			if (n.equals("")) {
				System.out.println(0);
			}
			else {
				System.out.println(new BigInteger(n));
			}
			
		} 
	}

}
