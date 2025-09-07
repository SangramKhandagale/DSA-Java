import java.util.*;
public class Q4{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
      range(n,m);
    }

    public static void range(int n,int m){

      for(int num=n;num<=m;num++){
         int count=0;
       for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
       }

       if(count==2){
        System.out.print(num+" ");
       }
    }
   
}
}