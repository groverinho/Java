import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 class circulos {

	 public static int Euclides(int a, int b)
	 {
			int r=b;
			while (b> 0)
			{
				r=a%b;
				a=b;
				b=r;
			}
			return (a);
	}
	
	public static void main(String[] args) 
	{
		Scanner in  =  new Scanner(System.in);
		
			int n = in.nextInt();
			ArrayList<String> radio = new ArrayList<String>();
			for (int i = 0; i < n; i++)
			{
				int raiz, dem, denominador,totalN, totalD;
				int x1, y1, x2, y2, x3, y3;
				x1=in.nextInt();y1=in.nextInt();
				x2=in.nextInt();y2=in.nextInt();
				x3=in.nextInt();y3=in.nextInt();
				 raiz=(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))*(((x2-x3)*(x2-x3))+((y2-y3)*(y2-y3)))*(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));
				 dem =2*Math.abs((x1*y2)+(x2*y3)+(x3*y1)-(x1*y3)-(x2*y1)-(x3*y2));
				 denominador = dem * dem; 
				// System.out.println("raix "+ raiz +" denominador "+ denominador  );
				 if (raiz!=0 && denominador!=0) //para no dividir 0 entre 0
				 {		
					 totalN = raiz / Euclides(raiz, denominador);//simplifico
					 totalD = denominador / Euclides(raiz, denominador);//simplifico
					 radio.add(totalN+"/"+totalD);
				 }
				 else
					 radio.add(raiz+"/"+denominador);	
			}
			ArrayList<Integer> cont = new ArrayList<Integer>();
			int a=0;
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					if(radio.get(j).equals(radio.get(i)))  
					a++;
				}
				cont.add(a);
				a=0;
			}
			Collections.sort(cont);
			System.out.println(cont.get(n-1));
		
	}
}
 
/*
0 0 0 1 1 0
0 0 2 0 0 2
1 1 1 2 2 1
0 0 0 1 1 0
0 0 2 0 0 2
1 1 1 2 2 1
0 0 0 1 1 0
0 0 2 0 0 2
1 1 1 2 2 1
0 0 0 1 1 0
0 0 2 0 0 2
1 1 1 2 2 1


	 3 estudiar!!!
	2 2 2 2 2 2
	5 4 2 6 5 4
	3 2 5 2 2 2
	2 
 */