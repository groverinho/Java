import java.util.Scanner;


public class TheBestInternetBrowser {

	public static void main(String[] args) 
	{
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 while (n>0)
		 {
				 String url = in.next();
				 int vocal = 0;
				 for (int j = 4; j < url.length()-4; j++)
				 {
					 if (url.charAt(j)!='a'&&url.charAt(j)!='e'&&url.charAt(j)!='i'&&url.charAt(j)!='o'&&url.charAt(j)!='u')
					 {
						 vocal++;
					 } 
				 }
				 System.out.println((vocal+4)+"/"+url.length());
			 n--;
		 }	

	}

}
