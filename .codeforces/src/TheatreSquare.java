import java.util.Scanner;

public class TheatreSquare {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] num = input.split(" ");
        double n = Integer.parseInt(num[0]);
        double m = Integer.parseInt(num[1]);
        double a = Integer.parseInt(num[2]);

        long r = (long) (Math.ceil(n / a) * Math.ceil(m / a));
        System.out.println(r);
    }
}