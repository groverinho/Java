package BEGINNER;

public class S_SequenceII {

	public static void main(String[] args) 
	{
		double s = 1;
		double aux =0;
		for (double i =3, j=2; i <= 39; i= i+2, j=j*2)
		{
			aux = 0;
		    aux = i/j;
		    s=s + aux;
		   // System.out.println(i);
		}
		  System.out.printf("%.2f\n", s);
	}

}
