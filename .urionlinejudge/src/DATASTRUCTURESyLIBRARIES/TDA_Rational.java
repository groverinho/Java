package DATASTRUCTURESyLIBRARIES;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class TDA_Rational {
	public static void main(String[] args)  throws IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		int casos =0;
		casos=Integer.parseInt(entrada.readLine());
		while (casos>0)
		{
			int n1=0, d1=0, n2=0, d2=0;
			String x = ""; x= entrada.readLine(); //in.nextLine();
			String[] vectorX = new String [7];
			vectorX = x.split(" ");
			n1 =Integer.parseInt(vectorX[0]);
			d1 =Integer.parseInt(vectorX[2]);
			n2 =Integer.parseInt(vectorX[4]);
			d2 =Integer.parseInt(vectorX[6]);
			operar(n1, d1, n2, d2,vectorX[3]);
			casos--;	
		}
	}
	public static void operar(int n1,int d1,int n2,int d2, String op) 
	{
		int respN=0, respD=0;
		int totalN=0, totalD=0;
		if (op.equals("+"))
		{
			respN = (n1*d2) + (n2*d1);
			respD = d1*d2;
		}
		else if (op.equals("-"))
		{
			respN = (n1*d2) - (n2*d1);
			respD = d1*d2;
		}
		else if (op.equals("*"))
		{
			respN = n1*n2;
			respD = d1*d2;
		}
		else if (op.equals("/"))
		{
			respN = n1*d2;
			respD = n2*d1;
		}
		//System.out.println(respN+"/"+respD);
		if (Euclides(respN, respD)==1)
		{
			System.out.println(respN+"/"+respD+" = "+respN+"/"+respD);
		}
		else
		{
			
			totalN = respN / Euclides(respN, respD);
			totalD = respD / Euclides(respN, respD);
			System.out.println(respN+"/"+respD+" = "+totalN+"/"+totalD);
		}
	}
	public static int Euclides(int a, int b) 
	{
		int auxN= Math.abs(a);
		int auxD= Math.abs(b);
		int r=auxD;
		while (auxD> 0){
		r=auxN%auxD;
		auxN=auxD;
		auxD=r;
		}
		return (auxN);
	}
}
/*Sum: n1*d2 + n2*d1) / (d1*d2)
subtraction: (n1*d2 - n2*d1) / (d1*d2)
multiplication: (n1*n2) / (d1*d2)
division: (n1/d1) / (n2/d2), that means (n1*d2)/(n2*d1)
4
1 / 2 + 3 / 4
1 / 2 - 3 / 4
2 / 3 * 6 / 6
1 / 2 / 3 / 4
*/