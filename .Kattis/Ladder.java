import java.util.Scanner;

// Author: Grover Irusta M
// University: Universidad Privada Domingo Savio - Tarija
// Date: 27-10-16				

public class Ladder {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int altura = in.nextInt();
	int angulo = in.nextInt();
	//radianes =  grados x PI / 180 
	int hipo =(int) Math.ceil(altura/Math.sin(angulo*Math.PI/180));
System.out.println(hipo);
	}

}
