import java.util.Scanner;


public class Holidays {

	public static int maxDia( int dia)
	{
		if (dia == 1) {
			return 1;
		} else if (dia > 1) {
			return 2;
		}
		
		return 0;
		
	}
	public static int minDia (int dia)
	{
//		if(dia ==1 ||dia ==2 ||dia ==3||dia ==4||dia ==5)
//			return 0;
//		else 
		if (dia ==6)
			return 1;
		else if (dia ==7)
			return 2;
		else
			return 0 ;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int nDiv = n/7;
		int nMod =n%7;
		 
		int min = (nDiv*2) + minDia(nMod);
		int max = (nDiv*2 )+ maxDia(nMod);
		System.out.println(min + " "+max);
	}
}
