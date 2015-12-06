package MATHEMATICS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

import javax.swing.InputMap;


public class GrainsInAChessBoard 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader  entrada = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(entrada.readLine());
		while(casos>0)
		{
			int n = Integer.parseInt(entrada.readLine());
			BigInteger aux= new BigInteger("1");
			BigInteger dos = BigInteger.valueOf(2);
			BigInteger doce = BigInteger.valueOf(12);
			BigInteger mil = BigInteger.valueOf(1000);
			for (int i = 0; i < n; i++)
				aux = aux.multiply(dos); //aux = aux *2
			BigInteger kg= null;
			kg = aux.divide(doce).divide(mil);//kg = (aux/12)/1000;				//1kg =1000gr
			System.out.println(kg+ " kg");
			casos--;
		}  
	}

}
