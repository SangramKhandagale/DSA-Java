
import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
       System.out.println("Swapped numbers are: "+a+" and "+b);
    }
}
