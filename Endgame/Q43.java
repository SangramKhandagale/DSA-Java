package Endgame;
import java.util.*;

public class Q43 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String arr[] = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        String new_str = "";

        boolean result = true;
        int j = 0;   

        while(result) {


            for(int i = 0; i < n; i++) {
                if(j >= arr[i].length()) {
                    result = false;
                    break;
                }
            }

            if(!result) {
                break;
            }

            char c = arr[0].charAt(j);   

            for(int i = 0; i < n; i++) {
                if(c != arr[i].charAt(j)) {
                    result = false;
                    break;
                }
            }

            if(result) {   
                new_str += c;
                j++;
            }
        }

        System.out.println(new_str);
    }
}