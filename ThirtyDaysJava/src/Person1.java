import java.io.*;
import java.util.*;

public class Person1 {
    private int age;	

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
  
    public Person1(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            setAge(0);
            System.out.println("Age is not valid, setting age to 0. ");
        }
        else
            setAge(initialAge);
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print 
        //the correct statement:
        if (this.getAge() < 13) {
            System.out.println("You are young.");
        } else if (this.getAge() >= 13 && this.getAge() < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        // Increment this person's age.
        this.setAge(this.getAge() + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person1 p = new Person1(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                    p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}