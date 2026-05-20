import java.util.*;
public class Q24{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int steps = 0;

        while(!isPalindrome(n)){       
            long rev = reverse(n);     
            n = n + rev;               
            steps++;                   
        }

        System.out.println(steps);
    }

    public static boolean isPalindrome(long n){
        String s = String.valueOf(n);
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);         
    }

    public static long reverse(long n){
        String rev = new StringBuilder(String.valueOf(n)).reverse().toString();
        return Long.parseLong(rev);
    }
}