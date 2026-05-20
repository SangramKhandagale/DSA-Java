import java.util.*;
public class Q21{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=0;
        while(n!=0){
            if(n>=2000){
        n=n-2000;
        i++;
        }else if(n>=500){
            n=n-500;
            i++;
        }else if(n>=100){
            n=n-100;
            i++;
        }
        }

        System.out.println(i);
    }
}