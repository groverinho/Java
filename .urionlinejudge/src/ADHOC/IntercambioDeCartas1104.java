/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 21/11/2018
 */
package ADHOC;

import java.util.Scanner;
import java.util.TreeSet;

public class IntercambioDeCartas1104 {
	public static int calculate(TreeSet<Integer>cartasMenos, TreeSet<Integer>cartasMas) {
		int counter =0;
		for (Integer integer : cartasMenos) {
			if(!cartasMas.contains(integer)) {
				counter++;
			}
			
				//working on conditions
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int a = in.nextInt();
			int b = in.nextInt();
			if(a==0 && b==0) break;
			
			TreeSet<Integer> ta = new TreeSet<Integer>();
			TreeSet<Integer> tb = new TreeSet<Integer>();
			for (int i = 0; i < a; i++) {
				int aux =in.nextInt();
				ta.add(aux);
			}
			for (int i = 0; i < b; i++) {
				int aux =in.nextInt();
				tb.add(aux);
			}
			if(ta.size()<=tb.size()) {
				System.out.println(calculate(ta,tb));
			}
			else {
				System.out.println(calculate(tb,ta));
			}
		}			
	}

}
