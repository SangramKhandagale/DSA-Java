import java.util.*;
public class Q20{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int steps = 0;

        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;        // even → divide by 2
            } else {
                n = (n * 3) + 1;  // odd → multiply 3, add 1
            }
            steps++;              // count every step
        }

        System.out.println(steps);
    }
}