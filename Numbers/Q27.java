import java.util.*;
public class Q27{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int count=0;
       
        for(int j=n;j<=m;j++){
             if(isPerfect(j)){
            count++;
        }
        }

        System.out.println(count);
    }

    public static boolean isPerfect(int j){
int sum=0;
boolean result=false;
        for(int i=1;i<j;i++){
if(j%i==0){
    sum=sum+i;
}
       }

       if(sum==j){
        result=true;
       }

       return result;
    }
}