import java.util.Scanner;


public class EsMayoroMenordeEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String resp = null;
		resp = (n>=18)? "Es Mayor" : "Es Menor";
		System.out.println(resp);
	}

}
