import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        in.close();
        
        for (int i = 1; i <= 10; i++) {
            result = result + n;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
