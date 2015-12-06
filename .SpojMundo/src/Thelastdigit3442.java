
import java.util.Scanner;


 class Thelastdigit3442 {

	public static void main(String[] args) 
	{
	Scanner in  = new Scanner(System.in);
	
	int n =in.nextInt();
	while (n>0)
	{
		int a = in.nextInt();
		int b = in.nextInt();
		String num = Integer.toString((int) Math.pow(a,b));
		///System.out.println(num);
		int d = num.length();
		System.out.println(num.charAt(d-1)); 
		n--;
	}

	}

}
