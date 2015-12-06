import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Eevee {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            String[] words = 
            {"vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon"};

            while ((input = reader.readLine()) != null && input.length() > 0) 
            {
                int n = Integer.parseInt(input.trim());
                char[] encryptWord = reader.readLine().trim().toCharArray();
                
                for (String word : words) 
                {
                    if (word.length() == n)
                    {
                        char[] wordChars = word.toCharArray();
                        boolean found = true;
                    
                        for (int i = 0; i < n; i++) 
                        {
                            if (encryptWord[i] != '.' && encryptWord[i] != wordChars[i])
                            {
                                found = false;
                                break;
                            }
                        }
                        
                        if (found) 
                        {
                            System.out.println(word);
                            break;
                        }
                    }
                
               }
        }
    }
}