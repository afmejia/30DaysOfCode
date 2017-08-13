import java.util.Scanner;

public class Review {
    
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String odd;
        String even;
        String strIn;
        char[] str;
        int T;
        
        T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            strIn = in.next();
            str = strIn.toCharArray();
            odd = "";
            even = "";
            for (int j = 0, len = strIn.length(); j < len; j++) {
                if (j % 2 == 0)
                    even += str[j];
                else
                    odd += str[j];
            }
            System.out.println(even + " " + odd);
        }
        in.close();
    }
}