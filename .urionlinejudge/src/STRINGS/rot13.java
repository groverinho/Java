package STRINGS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rot13 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;

        while((line = br.readLine()) != null){

            for(int i = 0; i < line.length(); i++){

                char c = line.charAt(i);

                if(c >= 'a' && c <= 'm' || c >= 'A' && c <= 'M') 
                {
                    c += 13;
                }
                else if(c >= 'n' && c <= 'z' || c >= 'N' && c <= 'Z') 
                {
                    c -= 13;
                }

                sb.append(c);

            }

            sb.append("\n");

        }

        System.out.print(sb);

    }

}
