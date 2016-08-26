import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 

public class Pet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int []v = new int [5];
		int []equipo = new int [4];
		ArrayList<Integer>lista = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 4; j++) {
				equipo[j]= in.nextInt();
				v[i]+= equipo[j];
				
			}
			lista.add(v[i]);
		}
		Arrays.sort(v);
		int index = 0;
		for (int i = 0; i < lista.size(); i++)
		{
			if (lista.get(i)==v[v.length-1])
			{
				index = i;
				break;
			}
		}
		System.out.println((index+1 )+" "+ v[v.length-1]);
		

	}

}
