		import java.util.Scanner;
		
		
		public class detectiveH {
		
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				double eps = 1e-6 ;
				 int t ;
				  t = in.nextInt();
				    while(t-->0)
				    {
				        double s , n , k , m ;
				        s=in.nextDouble();//velocidad agente r
				        n=in.nextDouble();//metro al agente r
				        k=in.nextDouble();//velocidad detective h
				        m=in.nextDouble();//metro detective h
				        if((m/k)>(n/s))
				           System.out.println("-1");
				        else
				        	System.out.printf("%.5f\n", ((n/s))-((m/k)));
				    }
			}
		
		}
