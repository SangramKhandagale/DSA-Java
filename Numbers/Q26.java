import java.util.*;
public class Q26{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       

      while(n!=1 && n!=4){
         int sum=0;
          while(n>0){
          int r=n%10;
          sum=sum+(int)Math.pow(r,2);
          n=n/10;
        }
        n=sum;
      }

        if(n==1){
            System.out.println("Happy");
        }else{
            System.out.println("Sad");
        }
    }
}