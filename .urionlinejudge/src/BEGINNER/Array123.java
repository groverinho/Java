package BEGINNER;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Array123 {

    public static void main(String[] args) throws IOException{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String line;

        while((line = r.readLine()) != null && line.length() != 0)
        {
            int n = Integer.parseInt(line);
            int k = n-1;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {

                    if(j == k)
                        sb.append("2");
                    else if(i == j)
                        sb.append("1");
                    else
                        sb.append("3");
                }
                k--;
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}
