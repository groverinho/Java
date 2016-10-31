import java.util.Scanner;
import java.util.TreeSet;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 30-10-16
 */

public class ValeraandAntiqueItems {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int v = in.nextInt();
		int i =0;
		int j=0;
		int bandera=0;
		TreeSet<Integer> lista = new TreeSet<Integer>();
		while(i<n){
			bandera =0;
			j = in.nextInt();
			while(j>0){
				if(in.nextInt()<v)
					bandera = 1;
				j--;	
			}
			if(bandera == 1){
	
				lista.add(i+1);
			}
			i++;
		}
		System.out.println(lista.size());
		for (Integer vendedores : lista) {
			 System.out.print(vendedores + " ");
		}
	   
		
		
	}

}
