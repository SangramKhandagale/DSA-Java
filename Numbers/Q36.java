import java.util.*;
public class Q36{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String num = String.valueOf(n);

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < num.length()-1; i++){
            int curr = num.charAt(i) - '0';
            int next = num.charAt(i+1) - '0';

            if(curr > next) increasing = false;  
            if(curr < next) decreasing = false;  
        }

        if(!increasing && !decreasing){
            System.out.println("BOUNCY");
        } else {
            System.out.println("NOT BOUNCY");
        }
    }
}