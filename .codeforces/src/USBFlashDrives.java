import java.util.Arrays;
import java.util.Scanner;


public class USBFlashDrives {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos  = in.nextInt();
		int max = in.nextInt();
		
		int almacenamiento  =0;
		int c=0;
		int pendrives[]=new int [casos];
		for (int i = 0; i < casos; i++)
		{
			pendrives[i]=in.nextInt();
		}
		Arrays.sort(pendrives);
		for (int i = pendrives.length-1; i >=0;i--) 
		{
			almacenamiento+=pendrives[i];c++;	
			if (almacenamiento>= max) {
				break;
			}
		}

		System.out.println(c);

	}

}
