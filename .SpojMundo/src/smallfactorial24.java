


 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class smallfactorial24{
    public static void main(String args[]){
    	smallfactorial24 m=new smallfactorial24();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=0;
        int n=0;
        try{
            t=Integer.parseInt(br.readLine());
            
            while(t-->0){
                n=Integer.parseInt(br.readLine());
                System.out.println(m.fact(n,1));
            }
            
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    BigDecimal fact(int n,int acum){
        return fact(n,new BigDecimal(acum));
    }
    
    BigDecimal fact(int n,BigDecimal acum){
        if(n==1 || n==0){
            return acum; 
        }
        return fact(n-1,acum.multiply(new BigDecimal(n)));
    }
} 

 