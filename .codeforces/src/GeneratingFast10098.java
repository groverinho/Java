import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class GeneratingFast10098
{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int cases=Integer.parseInt(br.readLine());
        StringBuffer out=new StringBuffer("");
        for(int i=0;i<cases;i++)
        {
            char[] m=br.readLine().toCharArray();
            Arrays.sort(m);
            StringBuilder s=new StringBuilder("");
            for(int j=0;j<m.length;j++){
                s.append(m[j]);
            }
            perm(new StringBuilder(""),s,out);
            out.append("\n");
        }
        System.out.print(out);
    }
    
    static void perm(StringBuilder pre ,StringBuilder s,StringBuffer out) {
        if (s.length() == 0) { 
            out.append(pre).append("\n");
        }else{
        for (int i = 0; i < s.length(); i++) {
             if(i<s.length()-1){
                 if(s.charAt(i)==s.charAt(i+1)){
                     continue;
                 }
             }
             perm(new StringBuilder("").append(pre).append(s.charAt(i)), new StringBuilder("").append(s.substring(0, i)).append(s.substring(i+1, s.length())),
                     out);
             }
        }
       
    }
}