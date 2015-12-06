
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SMSTyping11530 {

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String n = in.readLine();
        int n2 = Integer.parseInt(n);
        String letra = "";
        for(int i=1;i<=n2;i++)
        {
            letra=in.readLine();
            int sum=0;        
            for(int j=0;j<letra.length();j++)
            {
                sum+=pulso(letra.charAt(j));
            }
           System.out.println("Case #"+i+": "+ sum);
        }
     
    }

    static int pulso(char x)
    {
        if(x=='b' ||x=='e'||x=='h'
         ||x=='k'||x=='n'||x=='q'
         ||x=='u'||x=='x')
           return 2;
        if(x=='c' ||x=='f'||x=='i'
         ||x=='l'||x=='o'||x=='r'
         ||x=='v'||x=='y')
           return 3; 
        if(x=='s'||x=='z')
           return 4; 
        return 1;
    }
}