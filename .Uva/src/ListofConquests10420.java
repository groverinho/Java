import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 04-11-16
 */

public class ListofConquests10420 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> paises = new ArrayList<String>();

        for (int i = 0; i < n; ++i) {
            String cad = in.nextLine();
            String[] v = cad.split("[ ]");
            paises.add(v[0]);
        }

        Collections.sort(paises);

        String pais = paises.get(0);
        int c = 1;
        for (int i = 1; i < n; ++i) {
            if (!paises.get(i).equals(pais)) 
            {
                System.out.println(pais + " " + c);
                c = 1;
                pais = paises.get(i);
            }
            else 
            	++c;
        }
        System.out.println(pais + " " + c);



	}

}
