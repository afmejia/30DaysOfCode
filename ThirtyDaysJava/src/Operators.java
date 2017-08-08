
import static java.lang.Math.round;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Operators meal = new Operators();
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();
        
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent /100;
        
        int totalCost = (int) round(mealCost + tip + tax);
        System.out.println("The total meal cost is " + totalCost + "dollars.");
    }
}