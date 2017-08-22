/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe
 */
import static java.lang.Math.abs;
import java.util.Scanner;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
        
        Difference(int[] elements) {
            this.elements = elements;
        }
        
        void computeDifference() {
            maximumDifference = 0;
            int diff;
            for (int i = 0, size = elements.length; i < size - 1; i++)
                for(int j = i + 1; j < size; j++) {
                    diff = abs(elements[i] - elements[j]);
                    maximumDifference = diff > maximumDifference ? diff :
                            maximumDifference;
                }
        }
}

public class MaxDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
