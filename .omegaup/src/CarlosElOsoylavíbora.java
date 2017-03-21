import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class CarlosElOsoylavíbora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		String par="", impar="";
		for (int i = 0; i < b; i++) {
			par+="#";
		}
		for (int i = 0; i < b-1; i++) {
			impar+=".";
		}
		boolean flag=false;
		boolean derecha=true;;
		for (int i = 0; i <a; i++) {
			if (!flag) {
				System.out.println(par);
				flag=true;
			}
			else{
				if (derecha) {
					System.out.println(impar+"#");
					derecha=false;
				}
				else{
					System.out.println("#"+impar);
					derecha=true;
				}
				
				flag=false;
			}
				
		}
	}

}
