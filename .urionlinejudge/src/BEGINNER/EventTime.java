package BEGINNER;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EventTime {

    public static void main(String[] args) throws IOException {

        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        String diaLinea1 = in.readLine();
        String timeLine1 = in.readLine();
        String diaLinea2 = in.readLine();
        String timeLine2 = in.readLine();

        int day1 = Integer.parseInt(diaLinea1.substring(4));
        int day2 = Integer.parseInt(diaLinea2.substring(4));
        int hours1 = 0;
        int min1 = 0;
        int sec1 = 0;
        int hours2 = 0;
        int min2 = 0;
        int sec2 = 0;

        if(day2 > day1)
        {
            String[] parts1 = timeLine1.split(" : ");
            hours1 = Integer.parseInt(parts1[0]);
            min1 = Integer.parseInt(parts1[1]);
            sec1 = Integer.parseInt(parts1[2]);
            String[] parts2 = timeLine2.split(" : ");
            hours2 = Integer.parseInt(parts2[0]);
            min2 = Integer.parseInt(parts2[1]);
            sec2 = Integer.parseInt(parts2[2]);
        }
        else
        {
            int tmp = day1;
            day1 = day2;
            day2 = tmp;
            String[] parts1 = timeLine1.split(" : ");
            hours2 = Integer.parseInt(parts1[0]);
            min2 = Integer.parseInt(parts1[1]);
            sec2 = Integer.parseInt(parts1[2]);
            String[] parts2 = timeLine2.split(" : ");
            hours1 = Integer.parseInt(parts2[0]);
            min1 = Integer.parseInt(parts2[1]);
            sec1 = Integer.parseInt(parts2[2]);
        }

        int diffDays = day2 - day1;
        int diffHours = 0;
        int diffMins = 0;
        int diffSecs = 0;
        if(hours2 >= hours1)
            diffHours = hours2 - hours1;
        else
        {
            diffHours = (24 - hours1) + hours2;
            diffDays--;
        }
        if(min2 >= min1)
            diffMins = min2 - min1;
        else
        {
            diffMins = (60 - min1) + min2;
            diffHours--;
        }
        if(sec2 >= sec1)
            diffSecs = sec2 - sec1;
        else
        {
            diffSecs = (60 - sec1) + sec2;
            diffMins--;
        }
        System.out.printf("%d dia(s)\n", diffDays);
        System.out.printf("%d hora(s)\n", diffHours);
        System.out.printf("%d minuto(s)\n", diffMins);
        System.out.printf("%d segundo(s)\n", diffSecs);
    }
}
