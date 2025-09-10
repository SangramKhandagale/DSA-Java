import java.util.*;
public class Q14 {
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int count=0;
    while(n>0){
        n=n &(n-1);
        count++;
    }
    System.out.println(count);
   } 
}
