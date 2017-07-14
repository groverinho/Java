/**
Name: Grover Irusta Miranda
Date: 07-2017
Company: Coderoad - Mojix
 */
package DATASTRUCTURESyLIBRARIES;

import java.util.Scanner;
import java.util.TreeSet;

public class GeneratingFastSortedPermutation {
	public static TreeSet<String>treeset = new TreeSet<String>();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-->0) {
			String str = in.next();
			StringBuffer strBuf = new StringBuffer(str);
			doPerm(strBuf,str.length());
			for (String s : treeset) {
				System.out.println(s);
			}
			System.out.println();
			treeset.clear();
		}
	}
	
	private static void doPerm(StringBuffer str, int index){
		if(index <= 0){
			//System.out.println(str);
			treeset.add(str.toString());
		}
				
		else { //recursively solve this by placing all other chars at current first pos
			doPerm(str, index-1);		
			int currPos = str.length()-index;		
			for (int i = currPos+1; i < str.length(); i++) {//start swapping all other chars with current first char	
				swap(str,currPos, i);
				doPerm(str, index-1);			
				swap(str,i, currPos);//restore back my string buffer	
			}	
		}
	
	}
	
	private static void swap(StringBuffer str, int pos1, int pos2){
		char t1 = str.charAt(pos1);	
		str.setCharAt(pos1, str.charAt(pos2));	
	str.setCharAt(pos2, t1);
	}
}