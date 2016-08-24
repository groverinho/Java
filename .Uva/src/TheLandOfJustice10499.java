import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 23-08-16

public class TheLandOfJustice10499 {
	// esfera 4*Pi*r^2
	// ring Pi*r^2
	//  n > 1 => n * Pi * r^2
    // 4 = 100%
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			if (n<0)
			{
				break;
			}
			long resultado=0;
			if (n == 1) {
			      resultado = 0;
			    } else {

			    	resultado =  (long)n * 100 / 4;
			    }
			System.out.println(resultado+"%");
	
		}
		

	}

}
