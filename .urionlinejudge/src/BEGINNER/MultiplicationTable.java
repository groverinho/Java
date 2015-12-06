package BEGINNER;
import java.util.Scanner;


public class MultiplicationTable {

	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <=10; i++) {
			int r = i * n;
			System.out.println(i+" x "+n+" = "+r);//1 x 140 = 140
		}
	}

}
