import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerCode {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j;
        double x;

        /* Read and save an integer, double, and String to your variables.*/
        j = scan.nextInt();
        x = scan.nextDouble();
        scan.nextLine(); // Skip the remainder of the double line
        String[] z = scan.nextLine().split(" ");



        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        /* Print the sum of both integer variables on a new line. */
        System.out.printf("%d\n", j + i);

        /* Print the sum of the double variables on a new line. */
        System.out.printf("%.1f\n", x + d);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.print(s);
        for(int t = 0; t < z.length; t++) {
            System.out.print(z[t] + " ");
        }

        //scan.close();
    }
}
