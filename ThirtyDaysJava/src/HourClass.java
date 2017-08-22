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

public class HourClass {
    
    public static int hourGlass(int arr[][], int i, int j) {
        int sum;
        sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1]
                + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]; 
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        
        int maxHourGlass = -100;
        int currentHourGlass;
        
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                currentHourGlass = hourGlass(arr, i, j);
                System.out.println(currentHourGlass);
                maxHourGlass = currentHourGlass > maxHourGlass ?
                        currentHourGlass : maxHourGlass;
            }
        
        System.out.println(maxHourGlass);
    }
}
