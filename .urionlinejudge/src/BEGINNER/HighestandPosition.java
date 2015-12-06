package BEGINNER;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class HighestandPosition {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer>lista = new ArrayList<Integer>();
		int n [] = new int [11];
		
		for (int i = 1; i < n.length; i++) 
		{
			n[i] = in.nextInt();
			lista.add(n[i]);
		}
		Arrays.sort(n);
		int aux = n[10];
		int cont=0;
		//int aa = Arrays.binarySearch(n, aux); raro!
		
		for (int i = 0; i < lista.size(); i++, cont++)
		{
			if (lista.get(i)==aux)
				break;
		}
		System.out.println(aux+"\n"+(cont+1));
	}

}
