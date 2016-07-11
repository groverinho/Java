import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;


public class VelocidadMach {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (in.hasNext()) {
		
	
	int n = in.nextInt();
	
	double v =(n*1000)/3600;
	v = v/340;
	  BigDecimal bg1, bg2;
	 bg1 = new BigDecimal(v);
    bg2 = bg1.setScale(1, BigDecimal.ROUND_DOWN);
	System.out.println(bg2);
	//System.out.printf("%.1f\n",v);
	}
	}

}
