import java.util.*;
public class Q15{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int currentsum=arr[0];
        int maxsum=arr[0];

        for(int i=0;i<n;i++){
            currentsum=Math.max(arr[i],currentsum+arr[i]);

            maxsum=Math.max(currentsum,maxsum);
        }

        System.out.println(maxsum);

    }
}