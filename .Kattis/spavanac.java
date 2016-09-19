import java.util.Scanner;

// Author: Grover Irusta M
// University: Universidad Privada Domingo Savio - Tarija
// Date: 19-09-16

public class spavanac {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			int hora = in.nextInt();
			int minuto = in.nextInt();
			if (minuto-45<0)
			{
				if (hora>=0) {
					hora--;
				}
				
				minuto = 60 - (45-minuto);
				
			}
			else
			{
				minuto -= 45;
			}
			if (hora<0) {
				hora=23;
			}
			if (minuto==60) {
				minuto=0;
			}
			System.out.println(hora+" "+minuto);
		}

	}

}
/*
10 45
1 45
0 45
0 46
10 10
0 30
23 40
0 44
*/