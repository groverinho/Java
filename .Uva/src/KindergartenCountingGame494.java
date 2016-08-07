


import java.util.*;
//494
public class KindergartenCountingGame494 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            int cnt = 0;
            int i = 0;
            while (i < line.length()) {
                if (Character.isLetter(line.charAt(i))) {
                    ++cnt;
                    while (Character.isLetter(line.charAt(i))) ++i;
                }
                ++i;
            }
            System.out.println(cnt);
        }
    }
}
