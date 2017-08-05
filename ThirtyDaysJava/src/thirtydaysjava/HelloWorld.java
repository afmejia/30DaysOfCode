/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirtydaysjava;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get input
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        scan.close();
      
        
        // Print input
        System.out.println("Hello World!");
        System.out.println(x);
    }
    
}