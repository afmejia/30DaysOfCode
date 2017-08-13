
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe
 */
public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        // Print array in reverse order
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0)
                System.out.print(" ");
        }
    }
}
