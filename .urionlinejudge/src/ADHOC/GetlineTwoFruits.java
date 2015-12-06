package ADHOC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GetlineTwoFruits {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(entrada.readLine());
		double[]num = new double[casos];
		String[]fruta = new String[casos];
		double acukilos=0;
		double acunum=0;
		int[]aux = new int[casos];
		for (int i = 0; i < casos; i++) 
		{
			 num[i] =Double.parseDouble((entrada.readLine()));
			 fruta[i]=entrada.readLine();
			aux[i]= (int) Math.round(num[i]/casos);
			 acukilos = acukilos + (Math.round(num[i]/casos));
			 acunum = acunum + num[i];
			 
		}
		for (int i = 0; i < casos; i++)
			 System.out.println("day "+(i+1)+": "+aux[i]+" kg");
		System.out.printf("%.2f",(acukilos/casos));
		System.out.println(" kg by day");
		System.out.printf("R$ %.2f",(acunum/casos));
		System.out.println(" by day");
		//2.33 kg by day
		//R$ 7.26 by day
		
	}

}
