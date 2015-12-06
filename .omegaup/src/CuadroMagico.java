import java.util.Scanner;


public class CuadroMagico {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int t [][] = new int[3][3];

	    for(int i = 0; i < 3; i++)
	        for(int j = 0; j < 3; j++)
	            t[i][j] = in.nextInt();

	    if((t[0][0]+t[0][1]+t[0][2] == 15)&&(t[1][0]+t[1][1]+t[1][2] == 15)&&
	       (t[2][0]+t[2][1]+t[2][2] == 15)&&(t[0][0]+t[1][0]+t[2][0] == 15)&&
	       (t[0][1]+t[1][1]+t[2][1] == 15)&&(t[0][2]+t[1][2]+t[2][2] == 15)&&
	       (t[0][0]+t[1][1]+t[2][2] == 15)&&(t[0][2]+t[1][1]+t[2][0] == 15))
	            System.out.println("SI");
	    else
	    	System.out.println("NO");
	}

}
