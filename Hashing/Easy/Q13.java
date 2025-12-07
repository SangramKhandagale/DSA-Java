package Hashing;
import java.util.*;
public class Q13{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elemnets:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("Enter target:");
        int target=in.nextInt();

        int count=0;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                  sum=sum+arr[j];
               if(sum==target){
                count++;
               }
            }
        }

        System.out.println(count);
    }
}