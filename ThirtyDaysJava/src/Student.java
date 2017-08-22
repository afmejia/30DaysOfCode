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

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + firstName + 
                "\nID: " + idNumber); 
    } 
}

class Student extends Person {
    private int[] testScores;
    
    // Constructor
    Student(String firstName, String lastName, int id, int scores[]) {
        super(firstName, lastName, id);
        testScores = scores;
    }
    
    char calculate() {
        int n = testScores.length;
        double a = 0;
        char score;
        
        for (int i = 0; i < n; i++)
            a = a + this.testScores[i];
        a = a / n;
        
        
        if (a >= 90 && a <= 100)
            score = 'O';
        else if(a >= 80 && a < 90)
            score = 'E';
        else if(a >= 70 && a < 80)
            score = 'A';
        else if(a >= 55 && a < 70)
            score = 'P';
        else if(a >= 40 && a < 55)
            score = 'D';
        else
            score = 'T';
        
        return score;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
                testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
