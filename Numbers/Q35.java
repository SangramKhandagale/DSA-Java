import java.util.*;
public class Q35{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int mul=1;
        int i=2;
        int j=i+1;
        int count=0;
        while(mul<n){
            mul=i*j;
            i++;
            j++;

            if(mul==n){
                count=1;
                break;
            }
        }

        if(count==1){
            System.out.println("Pronic");
        }else{
            System.out.println("Nope");
        }
    }
}