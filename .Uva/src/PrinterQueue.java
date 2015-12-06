import java.util.ArrayList;

import java.util.Scanner;


public class PrinterQueue {

	 public static void main(String[] args) throws Exception {
	        Scanner in = new Scanner(System.in);
	        int casos = in.nextInt();
	        for (int i = 0; i < casos; i++) 
	        {
	            int m = in.nextInt(), pos = in.nextInt();
	            ArrayList<Integer> lista = new ArrayList<Integer>();
	            for (int j = 0; j < m; j++) {
	            	lista.add(in.nextInt());
	            }
	            int tot = 0;
	            while (true) {
	                boolean bandera = false;
	                for (int j = 1; j < lista.size(); j++) {
	                    if (lista.get(j) > lista.get(0)) {
	                    	bandera = true;
	                        break;
	                    }
	                }
	                if (!bandera) {
	                    tot++;
	                    lista.remove(0);
	                } else {
	                    int x = lista.get(0);
	                    lista.remove(0);
	                    lista.add(x);
	                }
	                if (pos == 0 && !bandera) {
	                    break;
	                }
	                pos--;
	                if (pos < 0) {
	                    pos = lista.size() - 1;
	                }
	            }
	            System.out.println(tot);
	        }
	    }
	}
