package BEGINNER;

import java.util.ArrayList;
import java.util.Arrays;

public class SequenceIJ3 {

	public static void main(String[] args) {
		  ArrayList<Integer> listaI = new ArrayList<Integer>();
		  ArrayList<Integer> listaJ = new ArrayList<Integer>();
	 for (int i = 1; i < 10; i=i+2) 
		 for(int t=3; t>0; t--)
			 listaI.add(i);
	 for (int i = 7; i >=5 ; i--)
		listaJ.add(i);
	 for (int i = 9; i >=7 ; i--)
			listaJ.add(i);
	 for (int i = 11; i >=9 ; i--)
			listaJ.add(i);
	 for (int i = 13; i >=11 ; i--)
			listaJ.add(i);
	 for (int i =15; i >=13 ; i--)
			listaJ.add(i);
	 for (int i = 0; i < listaI.size(); i++) {
			System.out.println("I="+listaI.get(i)+" J="+listaJ.get(i));
		}
	}
}