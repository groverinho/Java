/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 18-10-16
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ulgyNumbers136 {
	public static int metodo(int n) {
	    if(n<=0)
	        return 0;
	 
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(1);
	 
	    int i=0;
	    int j=0;
	    int k=0;
	 
	    while(list.size()<n){
	        int m2 = list.get(i)*2;
	        int m3 = list.get(j)*3;
	        int m5 = list.get(k)*5;
	 
	        int min = Math.min(m2, Math.min(m3, m5));
	        list.add(min);
	 
	        if(min==m2)
	            i++;
	 
	        if(min==m3)
	            j++;
	 
	        if(min==m5)
	            k++;
	    }
	 
	    return list.get(list.size()-1);
	}
	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
	
			
			//int n=in.nextInt();
				
//		for (int i = 0; i <1500; i++) {
//			System.out.println(metodo(i));
//		}
//					
        System.out.println("The 1500'th ugly number is "+metodo(1500)+".");		
					
		
		
		
	}
}
