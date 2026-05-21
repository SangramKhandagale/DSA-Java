import java.util.*;
public class Q34{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String num=String.valueOf(n);
        String numrev=new StringBuilder(num).reverse().toString();
        int newnum=Integer.parseInt(numrev);
int count =0;
int count1=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }

          for(int i=2;i<n;i++){
            if(newnum%i==0){
                count1++;
            }
        }

        if(count1==0 && count==0){
            System.out.println("Twisted Prime");
        }else{
            System.out.println("Nope");
        }

    }
}