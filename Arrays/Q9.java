import java.util.*;
public class Q9{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=in.nextInt();
        }

        int expected=(n*(n+1))/2;
         int result=0;
        for(int i=0;i<n;i++){
            result=result+arr[i];
        }

        int missing=expected-result;

          System.out.println(missing);

    }
}