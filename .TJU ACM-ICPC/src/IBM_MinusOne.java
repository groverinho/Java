import java.util.Scanner;


public class IBM_MinusOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		String cad;
		int c=1;
		char abecedario []= new char[27];
		int j=0;
		for (char i = 'A' ; i <='Z'; i++,j++) 
			abecedario[j]=i;
//		for (int i = 0; i < abecedario.length; i++) {
//			System.out.println(abecedario[i]);
//		}
		while (casos -- > 0)
		{
			 cad = in.next();
			 System.out.println("String #"+c);

				for (int i = 0; i < cad.length(); i++)
				{
					for (int k = 0; k < abecedario.length; k++) 
					{
						if (cad.charAt(i)==abecedario[k])
						{
							System.out.print(abecedario[k+1]);
						}
						if (cad.charAt(i)=='Z') {
							System.out.print("A");
							break;
						}
					}
					
				}
				System.out.println();
				System.out.println();
			
			c++;
		}
	}

}
