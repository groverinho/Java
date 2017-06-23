package codeforces;

import java.util.Scanner;

/**
Name: Grover Irusta M.
Company: CodeRoad
Date: 2017
 */
public class KarenandMorning {

	public static boolean palindromo(String cadena ){
		StringBuilder c2 = new StringBuilder(cadena);
		c2= c2.reverse();
		return (c2+"").equals(cadena) ? true:false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cont =0;
		String c = in.next();
		String v[] = c.split(":");
		int hora = Integer.parseInt(v[0]);
		int minuto= Integer.parseInt(v[1]);
		String auxHora=v[0];
		String auxMin=v[1];
		String aux=v[0]+":"+v[1];
		while(!palindromo(aux)){
			minuto++;
			
			if (minuto==60) {
				minuto=0;
				hora++;
			}
			if (hora==24) {
				hora=0;
				minuto=0;
			}
			auxHora = hora+"";
			auxMin = minuto+"";
			if (auxMin.length()==1) {
				auxMin= "0"+auxMin;
			}
			if (auxHora.length()==1) {
				auxHora="0"+auxHora;
			}
			aux = auxHora+":"+auxMin;
			cont++;
		}
		System.out.println(cont);

	}

}
