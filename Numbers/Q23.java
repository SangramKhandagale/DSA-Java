import java.util.*;
public class Q23{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();

        int count=0;

        for(int i=n;i<=m;i++){
        if(isArmstrong(i)){
            count++;
        }
        }

        System.out.println(count);
    }

    public static boolean isArmstrong(int i){
        boolean result=false;
        int r=0,sum=0;
        int p=i;

        int power=String.valueOf(i).length();
          
      while(i>0){
          r=i%10;
        sum=sum+(int)Math.pow(r, power);
        i=i/10;
      }
 
      if(p==sum){
        result=true;
      }

      return result;

        
    }
}