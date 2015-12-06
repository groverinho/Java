

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TheDepartmentofRedundancyDepartment484
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);

        String s;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        while ((s = in.readLine()) != null)
        {
            String[] cadNum = s.split(" ");
            for (int i = 0; i < cadNum.length; i++) 
            {
                int x = Integer.parseInt(cadNum[i]);
                if (map.containsKey(x)) 
                {
                    map.put(x, map.get(x) + 1);
                } 
                else {
                    list.add(x);
                    map.put(x, 1);
                }
            }
        }
        for (int i : list) 
        {
            int x = map.get(i);
           System.out.println(i + " " + x);
        }
//        pw.flush();
//        pw.close();

    }
}
