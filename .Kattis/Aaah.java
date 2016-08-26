import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 25-08-16

public class Aaah {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String a = in.next();
			String b = in.next();
			System.out.println(a.length()>=b.length()?"go":"no");	
		}
		
	}

}
