import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 18-10-16
 */

public class StrangeDialog1721 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		
		for(int h=0; h<n; h++)
		{
			String cad = in.next();
			char[] c =cad.toCharArray();//= new char[10000009];
//			for (int i = 0; i < cad.length(); i++) {
//				c[i]= cad.charAt(i);
//			}
			
			int m=c.length,i=0;
			int ans=0;
			
			while(i<m && ans==0)
			{
				if(c[i]=='p' && c[i+1]=='u'  && c[i+2]=='t' && c[i+3]=='o' && c[i+4]=='n' )
					i+=5;
				
				else if(c[i] == 'o'  &&  c[i+1] == 'n'  &&  c[i+2] == 'e' )
					i+=3;
				
				else if(c[i] == 'o'  &&  c[i+1] == 'u'  &&  c[i+2] == 't' )
				{
					i+=3;

					if(c[i] == 'p'  &&  c[i+1] == 'u'  && c[i+2] == 't' &&  (c[i+3] != 'o'  || c[i+4]!='n'  || c[i+5]=='e'))
						i+=3;
				}
				
				else if(c[i] == 'i' && c[i+1]=='n' && i+1<m)
				{
					i+=2;
					
					if(c[i] == 'p'  &&  c[i+1] == 'u'  && c[i+2] == 't' &&  (c[i+3] != 'o'  || c[i+4]!='n'  || c[i+5]=='e') )
						i+=3;
				}
				
				else
					ans=1;
			}
			
			if(ans==0 && i==m)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
