/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe
 */
import java.util.Scanner;

public class Binary {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int count = 0;
        int max = 0;
        while (n >= 1) {
            if (n == 1 || n % 2 == 1)
                count++;
            else {
                if (count > max)
                    max = count;
                count = 0;
            }
            n = n / 2;
        }
        if (count > max)
            max = count;
        System.out.println(max);
    }
}
