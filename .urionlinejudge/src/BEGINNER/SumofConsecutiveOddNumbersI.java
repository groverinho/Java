package BEGINNER;
import java.util.Scanner;


public class SumofConsecutiveOddNumbersI {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x, Soma=0, Menor, Maior;
		int [] Num = new int [2];

		for(x=0; x<=1; x++)
			Num[x]=in.nextInt();

		if(Num[0] < Num[1]){
		Menor = Num[0];
		Maior = Num[1];}
		else{
		Menor = Num[1];
		Maior = Num[0];}

		Menor+=1;

		for(x = Menor ; x < Maior; x++){
		if(x%2 != 0)
		Soma += x;}

		System.out.println(Soma);
	}

}
