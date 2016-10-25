import java.util.Scanner;


public class AnotherEnclosedRegion {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String cad = in.next();
	int c =0;
	for (int i = 0; i < cad.length(); i++) {
		if (cad.charAt(i)=='A'||cad.charAt(i)=='O'||cad.charAt(i)=='P'||cad.charAt(i)=='D'||cad.charAt(i)=='Q'||cad.charAt(i)=='R') {
			c++;
		}
		else if(cad.charAt(i)=='B')
			c=c+2;

		
	}
System.out.println(c);
	}

}
//AFIVENCLOSEDREGIONS