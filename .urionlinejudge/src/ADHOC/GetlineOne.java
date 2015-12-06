package ADHOC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetlineOne {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String linea;
        boolean num = false;
        double sum = 0;
        double cnt = 0;

        while((linea = entrada.readLine()) != null && linea.length() > 0){

            if(num){
                sum += Integer.parseInt(linea);
                cnt++;
            }

            num = !num;

        }

        System.out.printf("%.1f\n", sum / cnt);

    }

}