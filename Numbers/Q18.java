import java.util.*;
public class Q18{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int count=0;

        for(int i=n;i<=m;i++){
          int sqrt=(int)Math.sqrt(i);
          if(sqrt*sqrt==i){
            count++;
          }
        }

        System.out.println(count);
    }
}