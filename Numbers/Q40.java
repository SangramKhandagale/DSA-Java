import java.util.*;
public class Q40{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }

        if(n%sum==0){
            System.out.println("Harshad");
        }else{
            System.out.println("Not Harshad");
        }
    }
}