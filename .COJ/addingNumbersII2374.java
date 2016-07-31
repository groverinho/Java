import java.util.Scanner;


public class addingNumbersII2374 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		String mayorA = a.replaceAll("5", "6");
		String menorA = a.replaceAll("6", "5");
		String mayorB = b.replaceAll("5", "6");
		String menorB = b.replaceAll("6", "5");
		System.out.println(Integer.parseInt(menorA)+Integer.parseInt(menorB)+" "+(Integer.parseInt(mayorA)+Integer.parseInt(mayorB) ));
		

	}

}
