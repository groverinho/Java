package BEGINNER;

public class S_Sequence {

	public static void main(String[] args) 
	{
		double s = 0;
		double aux =0;
		for (int i =1; i <= 100; i++) {
			
			aux = 0;
		      aux = 1.0/i;
		     s=s + aux;
		}
		  System.out.printf("%.2f\n", s);
	}

}
