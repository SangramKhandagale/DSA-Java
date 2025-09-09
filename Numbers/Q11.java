import java.util.*;
public class Q11{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        while(b>0){
           int temp=b;
           b=a%b;
           a=temp;
        }
        System.out.println(a);
    }
}