import java.util.Scanner;


public class cincoYseis {

	public static String maximizar(String num)
	{
		String aux="";
		for (int i = 0; i < num.length(); i++)
		{	
			if (num.charAt(i)=='5')
				aux = aux + "6";	
			else
				aux = aux + num.charAt(i);		
		}
		return aux;
	}
	public static String minimizar(String num)
	{
		String aux="";
		for (int i = 0; i < num.length(); i++)
		{	
			if (num.charAt(i)=='6')
				aux = aux + "5";	
			else
				aux = aux + num.charAt(i);			
		}
		return aux;
	}
	public static void main(String[] args) 
	{
		Scanner in  =new Scanner(System.in);
		String num1 = in.next();
		String num2 = in.next();
		int min1 = Integer.parseInt(minimizar(num1));
		int min2 = Integer.parseInt(minimizar(num2));
		int max1=Integer.parseInt(maximizar(num1));
		int max2=Integer.parseInt(maximizar(num2));
		//System.out.println(max1+max2);
		//System.out.println(max2);
		System.out.println((min1+min2) +" "+ (max1+max2));
	}

}
