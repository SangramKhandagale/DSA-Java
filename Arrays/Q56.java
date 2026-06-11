import java.util.*;
public class Q56{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int arr1[]=new int[n];
         int m=in.nextInt();
         int arr2[]=new int[m];

        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
        }

         for(int i=0;i<m;i++){
            arr2[i]=in.nextInt();
        }

        int sum=0;

        for(int i=0;i<m;i++){
            int num=arr2[i];

            for(int j=0;j<n;j++){
                if(arr1[j]>=num){
                 System.out.print(arr1[j]+" ");
                 sum=sum+arr1[j];
                 break;
                }else if(j==(n-1)){
                    System.out.print(-1);
                }
            }
        }

System.out.println(" "+sum);

    }
}