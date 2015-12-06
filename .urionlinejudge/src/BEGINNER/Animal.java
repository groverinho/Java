package BEGINNER;
import java.util.Scanner;


public class Animal {

	public static void main(String[] args) 
	{
		Scanner in  =new Scanner(System.in);
		String pal1 = in.next();
		String pal2 = in.next();
		String pal3 = in.next();
		if (pal1.equals("vertebrado"))
		{
			if (pal2.equals("ave"))
			{
				if (pal3.equals("carnivoro"))
				{
					System.out.println("aguia");
				}
				else if (pal3.equals("onivoro"))
				{
					System.out.println("pomba");
				}
			}
			else if (pal2.equals("mamifero"))
			{
				if (pal3.equals("onivoro"))
				{
					System.out.println("homem");
				}
				else if (pal3.equals("herbivoro"))
				{
					System.out.println("vaca");
				}
			}
		}
		else 
		{
			if (pal2.equals("inseto"))
			{
				if (pal3.equals("hematofago"))
				{
					System.out.println("pulga");
				}
				else if (pal3.equals("herbivoro"))
				{
					System.out.println("lagarta");
				}
			}
			else if (pal2.equals("anelideo"))
			{
				if (pal3.equals("hematofago"))
				{
					System.out.println("sanguessuga");
				}
				else if (pal3.equals("onivoro"))
				{
					System.out.println("minhoca");
				}
			}
		}
	}
}
