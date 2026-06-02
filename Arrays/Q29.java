import java.util.*;
public class Q29{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                 sum=sum+arr[j];

                  if(sum>max){
                max=sum;
            }
            }

        }

        System.out.println(max);
    }
}