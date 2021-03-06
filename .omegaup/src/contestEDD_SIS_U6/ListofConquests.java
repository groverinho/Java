package contestEDD_SIS_U6;

import java.util.*;

public class  ListofConquests {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            int n = Integer.parseInt(in.nextLine());
            ArrayList<String> countries = new ArrayList<String>();

            for (int i = 0; i < n; ++i) {
                String line = in.nextLine();
                String[] parts = line.split("[ ]");
                countries.add(parts[0]);
            }

            Collections.sort(countries);

            String country = countries.get(0);
            int cnt = 1;
            for (int i = 1; i < n; ++i) {
                if (!countries.get(i).equals(country)) {
                    System.out.println(country + " " + cnt);
                    cnt = 1;
                    country = countries.get(i);
                } else ++cnt;
            }
            System.out.println(country + " " + cnt);
        } catch (Exception e) {
            //e.printStackTrace();
            System.exit(0);
        }
    }
}