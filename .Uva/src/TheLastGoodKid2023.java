import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - Mojix
Date 12/04/2018
 */
public class TheLastGoodKid2023 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name ="", last = "";
        //while (!(name = in.readLine()).isEmpty()){
        	 while((name= in.readLine()) != null) {
            boolean change = true;
            for (int i = 0; i < last.length() && i < name.length() && change; i++) {
                if (Character.toLowerCase(name.charAt(i)) >= 'a' && Character.toLowerCase(name.charAt(i)) <= 'z') {
                    if (Character.toLowerCase(name.charAt(i)) > Character.toLowerCase(last.charAt(i))) {
                        change = true;
                        break;
                    }
                    change = Character.toLowerCase(last.charAt(i)) == Character.toLowerCase(name.charAt(i));
                } else if (last.charAt(i) != ' ') {
                    change = false;
                }
            }
            if (change) last = name;
        }
        System.out.println(last);
	}

}