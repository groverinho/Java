import java.util.Scanner;

public class mirrorSecuence2157 {

	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-->-0) {
			int e = in.nextInt();
			int b = in.nextInt();
			String cad = "";
			for (int i = e; i <= b; i++) {
				cad = cad.concat(i+"");
			}
			StringBuilder sb = new StringBuilder(cad);
			//sb.append(sb.reverse());
			System.out.println(cad.concat(sb.reverse().toString()));
		}
	
	}

}
