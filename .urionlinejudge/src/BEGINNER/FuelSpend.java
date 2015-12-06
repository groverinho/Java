package BEGINNER;
import java.util.Scanner;


public class FuelSpend {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
        
	       int velocidade = s.nextInt();
	        int tempo = s.nextInt();
	         
	        
	        double distancia = velocidade * tempo;
	        double consumo = distancia / 12; 



	System.out.printf("%.3f\n",consumo);
	}

}
