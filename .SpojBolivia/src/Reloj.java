
import java.util.Scanner;


 class Reloj {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			
		
		int h, totalh = 0;
		int m, totalm=0;
		
		h = in.nextInt();
		m = in.nextInt();
		if(h<=11)
			totalh = h*30;			
		if(h>=13)
			totalh = (h-12)*30;
		if(h==12 || h ==24)
			totalh=0;	
		if(m ==60)
			totalm=0;	
		else
		totalm = m*6;
		System.out.println(totalh+" "+totalm);
	}}

}
