
public class hojas {

	public static void main(String[] args) 
	{
		int cont1 = 0;
		int cont2 = 0;int cont3 = 0;
		for (int i = 1; i <= 11; i++)//1 - 10 
		{
			cont1++;
		}
		for (int i = 11; i <= 99; i++) 
		{
			cont2++;
		}
		cont2 = cont2*2;
		for (int i = 100; i <= 999; i++) 
		{
			cont3++;
		}
		cont3 = cont3 * 3;
		System.out.println(cont1+cont2+cont3+4);
	}

}
