
import java.util.HashMap;
import java.util.Map;
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
public class DictAndMaps {
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> myDict = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myDict.put(name, phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (myDict.containsKey(s))
                System.out.println(s + "=" + myDict.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
