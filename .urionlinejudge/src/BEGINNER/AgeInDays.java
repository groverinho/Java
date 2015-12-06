package BEGINNER;


import java.util.Scanner;


public class AgeInDays
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int dias = in.nextInt();
		int ano =0, mes = 0;
		while (dias>=365)
		{
			dias = dias-365;
			ano++;
		}
		while(dias>=30)
		{
			dias = dias-30;
			mes++;
		}
		System.out.println(ano+" ano(s)");
		System.out.println(mes+" mes(es)");
		System.out.println(dias+" dia(s)");
	}

}
