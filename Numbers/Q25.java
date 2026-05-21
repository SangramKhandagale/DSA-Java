import java.util.*;
public class Q25{
    public static void main(String arhs[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int count=0;

        for(int i=n;i<=m;i++){
            int rem=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    rem++;
                }
            }

            if(rem==1){
                count++;
            }
        }

        System.out.println(count);
    }
}