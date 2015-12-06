package BEGINNER;
	import java.util.Scanner;
	
	
	public class SalaryIncrease {
	
		public static void main(String[] args)
		{/*Novo salario: 460.00
	Reajuste ganho: 60.00
	Em percentual: 15 %*/
			Scanner in = new Scanner(System.in);
			while (in.hasNextDouble()) {
	
				    float vs=0,vr=0,nv = 0;
				    int vp = 0;
	
				    vs = in.nextFloat();
	
				    if((vs >= 0 ) && (vs <= 400)){
	
				        vr = (vs * 15)/100;
				        nv = vr + vs;
				        vp = 15;
	
				    }
				     if((vs > 400) && (vs <= 800)){
	
				        vr = (vs * 12)/100;
				        nv = vr + vs;
				        vp = 12;
	
				    }
				     if((vs > 800 ) && (vs <= 1200)){
	
				        vr = (vs * 10)/100;
				        nv = vr + vs;
				        vp = 10;
	
				    }
				     if((vs > 1200) && (vs <= 2000)){
	
				        vr = (vs * 7)/100;
				        nv = vr + vs;
				        vp = 7;
	
				    }
				     if(vs > 2000){
	
				        vr = (vs * 4)/100;
				        nv = vr + vs;
				        vp = 4;
	
				    }
				     	System.out.printf("Novo salario: %.2f\n",nv);
						System.out.printf("Reajuste ganho: %.2f\n",vr);
						System.out.println("Em percentual: "+vp+" %");	       
				}
		}
	}