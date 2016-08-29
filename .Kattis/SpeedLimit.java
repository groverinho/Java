import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 28-08-16

public class SpeedLimit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int casos = in.nextInt();
			if (casos == -1) {
				break;
			}
			int [] velocidad = new int [casos];
			int [] tiempo = new int [casos];
	 		for (int i = 0; i < casos; i++) {
				velocidad[i]= in.nextInt();
				tiempo[i] = in.nextInt();
			}
	 		int dist = velocidad[0]* tiempo[0];
	 		for (int i = 1; i < casos; i++) {
				dist+=velocidad[i]* (tiempo[i]-tiempo[i-1]);
			}
	 		System.out.println(dist+" miles");
	
		}
		
	}

}
