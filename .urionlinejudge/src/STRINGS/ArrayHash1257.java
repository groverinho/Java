/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 27/04/2018
 */
package STRINGS;

import java.util.Scanner;

public class ArrayHash1257 {
	public static int alphabet(char cad) {
		int index = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			if (cad == i) {
				break;
			}
			index++;
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int i = 0; i < cases; i++) {
			int l = in.nextInt();
			String[] lines = new String[l];
			for (int j = 0; j < lines.length; j++) {
				lines[j] = in.next();
			}
			int sum = 0;
			for (int m = 0; m < lines.length; m++) {
				String word = lines[m];
				// sum+=m; //Element of input
				for (int k = 0; k < word.length(); k++) {
					sum += alphabet(word.charAt(k));// Alphabet Position
					sum += k;// position in element
					sum += m;// Element of input
				}
			}
			System.out.println(sum);
		}

	}

}
/*
 * 5 2 CBA DDD 1 Z 6 A B C D E F 6 ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ 1 ZZZZZZZZZZ
 */