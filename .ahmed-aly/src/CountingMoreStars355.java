import java.util.Scanner;
import java.io.*;
//Date 07/11/18
public class CountingMoreStars355 {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
 int n = in.nextInt();
 for (int i = 1; i <= n; i++) {
    for (int j = 0; j < i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
}}
