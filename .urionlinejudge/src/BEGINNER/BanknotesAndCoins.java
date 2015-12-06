package BEGINNER;
import java.util.Scanner;

public class BanknotesAndCoins {

    public static void main(String[] args) {
    	Scanner in  =new Scanner(System.in);
    	int billete100 = 0, billete50 = 0, billete20 = 0, billete10 = 0, billete5 = 0, billete2 = 0;
    	int moneda100 = 0, moneda50 = 0, moneda25 = 0, moneda10 = 0, moneda5 = 0, moneda1 = 0;
	 	double valor = in.nextDouble();
    	while (valor >= 100) 
    	{
    		billete100++;
    		valor -= 100;
    	}
    	while (valor >= 50)
    	{
    		billete50++;
    		valor -= 50;
    	}
    	while (valor >= 20) 
    	{
    		billete20++;
    		valor -= 20;
    	}
    	while (valor >= 10)
    	{
    		billete10++;
    		valor -= 10;
    	}
    	while (valor >= 5) 
    	{
    		billete5++;
    		valor -= 5;
    	}
    	while (valor >= 2) 
    	{
    		billete2++;
    		valor -= 2;
    	}
    	while (valor >= 1)
    	{
    		moneda100++;
    		valor -= 1;
    	}
    	while (valor >= 0.5) 
    	{
    		moneda50++;
    		valor -= 0.5;
    	}
    	while (valor >= 0.25)
    	{
    		moneda25++;
    		valor -= 0.25;
    	}
    	while (valor >= 0.10)
    	{
    		moneda10++;
    		valor -= 0.10;
    	}
    	while (valor >= 0.05) 
    	{
    		moneda5++;
    		valor -= 0.05;
    	}
    	while (valor >= 0.01) 
    	{
    		moneda1++;
    		valor -= 0.01;
    	}

		System.out.println("NOTAS:");
		System.out.println(billete100 + " nota(s) de R$ 100.00");
		System.out.println(billete50 + " nota(s) de R$ 50.00");
		System.out.println(billete20 + " nota(s) de R$ 20.00");
		System.out.println(billete10 + " nota(s) de R$ 10.00");
		System.out.println(billete5 + " nota(s) de R$ 5.00");
		System.out.println(billete2 + " nota(s) de	 R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moneda100 + " moeda(s) de R$ 1.00");
		System.out.println((int)moneda50 + " moeda(s) de R$ 0.50");
		System.out.println((int)moneda25 + " moeda(s) de R$ 0.25");
		System.out.println((int)moneda10 + " moeda(s) de R$ 0.10");
		System.out.println((int)moneda5 + " moeda(s) de R$ 0.05");
		System.out.println((int)moneda1 + " moeda(s) de R$ 0.01");

    }

}